package com.rafaelshayashi.creational.singleton;

public class DbSingletonTest {

    public static void main(String[] args) {

        /*
         * Cria duas instancias e compara as duas para verificar que e a mesma instancia
         *
         * Essa abordagem nao e thread safe e lazy load
         */
        System.out.println("Singleton (NOT lazy loaded and NOT thread safe");
        DbSingleton instance = DbSingleton.getInstance();
        DbSingleton anotherInstance = DbSingleton.getInstance();
        System.out.println(instance);
        System.out.println(anotherInstance);
        System.out.println(instance == anotherInstance);

        /*
         * Nao possibilita a criacao atraves do construtor, descomentar a linha abaixo ira resultar em
         * um erro de compilacao
         */
        // DbSingleton dbSingleton = new DbSingleton();

        /*
         * Com lazy load ha um ganhe de performace, principalmente na inicializacao da aplicacao, porque antes de
         * aplicar essa melhoria o objeto era criado independetemente do seu uso. No caso de apenas um Singleton isso
         * nao parece ser tao problematico, porem conforme o aumento na quantidade de singleton isso pode impactar
         */
        System.out.println("Singleton (lazy loaded and NOT thread safe)");
        DbSingletonLazyLoaded dbSingletonLazyLoaded = DbSingletonLazyLoaded.getInstance();
        DbSingletonLazyLoaded dbSingletonLazyLoaded1 = DbSingletonLazyLoaded.getInstance();
        System.out.println(dbSingletonLazyLoaded);
        System.out.println(dbSingletonLazyLoaded1);
        System.out.println(dbSingletonLazyLoaded == dbSingletonLazyLoaded1);

        /*
         * Para tornar essa classe thread safe e necessario adicionar o volatile (https://pt.stackoverflow.com/questions/116047/qual-a-finalidade-do-transient-e-volatile-no-java)
         * e o syncronized para impedir que ocorra um problemas com duas threads pedindo instancias
         */
        System.out.println("Singleton (lazy loaded and thread safe)");
        DbSingletonLazyLoadedAndThreadSafe dbSingletonLazyLoadedAndThreadSafe = DbSingletonLazyLoadedAndThreadSafe.getInstance();
        DbSingletonLazyLoadedAndThreadSafe dbSingletonLazyLoadedAndThreadSafe1 = DbSingletonLazyLoadedAndThreadSafe.getInstance();
        System.out.println(dbSingletonLazyLoadedAndThreadSafe);
        System.out.println(dbSingletonLazyLoadedAndThreadSafe1);
        System.out.println(dbSingletonLazyLoaded == dbSingletonLazyLoaded1);
    }
}
