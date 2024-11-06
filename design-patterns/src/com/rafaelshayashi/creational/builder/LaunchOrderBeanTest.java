package com.rafaelshayashi.creational.builder;

public class LaunchOrderBeanTest {

    public static void main(String[] args) {

        /*
         * Criando um objeto com getters e setters
         * * Desvantagens
         *      * Imutabilidade
         *      * No contrato
         */
        LaunchOrderBean launchOrderBean = new LaunchOrderBean();

        launchOrderBean.setBread("Wheat");
        launchOrderBean.setCondiments("Lettuce");
        launchOrderBean.setDressing("Mustard");
        launchOrderBean.setMeat("Ham");

        System.out.println("==============================");
        System.out.println("Getters and Setters");
        System.out.println(launchOrderBean.getBread());
        System.out.println(launchOrderBean.getCondiments());
        System.out.println(launchOrderBean.getDressing());
        System.out.println(launchOrderBean.getMeat());

        /*
         * Criando com telescoping
         * * Vantagens
         *   * Umutabilidade
         * * Desvantagens
         *   * Pouca flexibilidade na criacao dos objetos
         */
        LaunchOrderBeanTelescoping launchOrderBeanTelescoping = new LaunchOrderBeanTelescoping("Wheat", "Lettuce", "Mustard", "Ham");
        System.out.println("==============================");
        System.out.println("Telescoping:");
        System.out.println(launchOrderBeanTelescoping.getBread());
        System.out.println(launchOrderBeanTelescoping.getCondiments());
        System.out.println(launchOrderBeanTelescoping.getDressing());
        System.out.println(launchOrderBeanTelescoping.getMeat());


        LaunchOrder.Builder builder = new LaunchOrder.Builder();
        builder.bread("Wheat").condiments("Lettuce").dressing("Mustard").meat("Ham");
        LaunchOrder launchOrder = builder.build();
        System.out.println("==============================");
        System.out.println("Builder pattern");
        System.out.println(launchOrder.getBread());
        System.out.println(launchOrder.getCondiments());
        System.out.println(launchOrder.getDressing());
        System.out.println(launchOrder.getMeat());

    }
}
