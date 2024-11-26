package dev.hayashi.lang;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Reflection {

    public static void main(String[] args) throws ClassNotFoundException {
        String pessoaClassName = "dev.rafaelhayashi.model.Pessoa";
        Class<?> pessoaClassReference = Class.forName(pessoaClassName);
        System.out.println(pessoaClassReference);

        /*
         * Obtém os atributos públicos da classe Pessoa e da classe mãe,
         * neste caso ira retornar apenas o atributo endereco pois é o
         * único atributo desta classe que é publico
         */
        Field[] fields = pessoaClassReference.getFields();
        System.out.println("======================");
        System.out.println("Fields:");
        System.out.println(Arrays.toString(fields));

        /*
         * Nesse caso obtém todos os atributos declarados idependente do modificador de acesso
         */
        Field[] declaredFields = pessoaClassReference.getDeclaredFields();
        System.out.println("======================");
        System.out.println("DeclaredFields:");
        System.out.println(Arrays.toString(declaredFields));

        /*
         * Nesse caso ira retornar todos os metodos publicos da classe Pessoa e também da sua classe mãe, que no caso
         * por padrão é a classe Object
         */
        Method[] methods = pessoaClassReference.getMethods();
        System.out.println("======================");
        System.out.println("Methods:");
        for (Method method : methods) {
            System.out.println(method);
        }

        Method[] declaredMethods = pessoaClassReference.getDeclaredMethods();
        System.out.println("======================");
        System.out.println("DeclaredMethods:");
        for (Method method: declaredMethods){
            System.out.println(method);
        }

        System.out.println("======================");
        System.out.println("StaticDeclaredMethods:");
        Arrays.stream(declaredMethods)
                .filter(method -> Modifier.isStatic(method.getModifiers()))
                .forEach(System.out::println);
    }
}
