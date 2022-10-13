package com.rafaelshayashi.strucural.composite;

import java.util.Iterator;

public class Menu extends MenuComponent {

    public Menu(String name, String url){
        this.name = name;
        this.url = url;
    }

    public MenuComponent add(MenuComponent menuComponent){
        this.menuComponents.add(menuComponent);
        return menuComponent;
    }

    public MenuComponent remove(MenuComponent menuComponent){
        this.menuComponents.remove(menuComponent);
        return menuComponent;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(); //builder pattern

        builder.append(print(this));

        Iterator<MenuComponent> itr = menuComponents.iterator();
        while(itr.hasNext()) {
            MenuComponent menuComponent = itr.next();
            builder.append(menuComponent.toString());
        }

        return builder.toString();
    }

}
