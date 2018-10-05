package com.design.pattern;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

public class MenuItemComposite extends MenuComponent {

    ArrayList<MenuComponent> menuComponents = new ArrayList<>();
    String description;
    int price;
    public MenuItemComposite(String description, int price){
        this.description = description;
        this.price = price;
    }

    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent){
        menuComponents.remove(menuComponent);
    }

    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    public void print(){
        System.out.println( " Menu : "+getDescription()+"  "+getPrice());

        menuComponents.iterator().forEachRemaining(a -> {
            ((MenuComponent)a).print();
        });

    }

    public String getDescription() {
        return description;
    }
    public int getPrice(){
        return price;
    }
}
