package com.rafaelshayashi.creational.factory;

public class FactoryTest {

    public static void main(String[] args) {
        Website blog = WebsiteFactory.getWebSite("blog");
        System.out.println(blog.getPages());

        Website shop = WebsiteFactory.getWebSite("shop");
        System.out.println(shop.getPages());
    }
}
