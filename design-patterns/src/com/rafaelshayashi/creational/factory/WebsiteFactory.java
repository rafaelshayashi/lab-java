package com.rafaelshayashi.creational.factory;

public class WebsiteFactory {

    public static Website getWebSite(String siteType){
        switch (siteType){
            case "blog": {
                return new Blog();
            }
            case "shop": {
                return new Shop();
            }
            default: {
                return null;
            }
        }
    }
}
