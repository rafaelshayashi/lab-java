package com.rafaelshayashi.creational.singleton;

public class DbSingletonLazyLoadedAndThreadSafe {

    private static volatile DbSingletonLazyLoadedAndThreadSafe instance = null;

    private DbSingletonLazyLoadedAndThreadSafe() {
        // Prevent a instantiation throw reflections
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to create");
        }
    }

    public static DbSingletonLazyLoadedAndThreadSafe getInstance() {
        if (instance == null) {
            synchronized (DbSingleton.class) {
                if (instance == null) {
                    instance = new DbSingletonLazyLoadedAndThreadSafe();
                }
            }
        }
        return instance;
    }
}
