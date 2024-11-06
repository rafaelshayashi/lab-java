package com.rafaelshayashi.creational.singleton;

public class DbSingletonLazyLoaded {

    private static DbSingletonLazyLoaded instance = null;

    private DbSingletonLazyLoaded(){}

    public static DbSingletonLazyLoaded getInstance(){
        if(instance == null){
            instance = new DbSingletonLazyLoaded();
        }
        return instance;
    }
}
