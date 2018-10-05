package com.design.pattern;

import java.util.ArrayList;

public class Waitress {

    ArrayList<Menu> menus; // = new ArrayList<>();
    public Waitress(ArrayList<Menu> menus){
        this.menus = menus;
    }

    public void printMenu(){
        menus.forEach(a -> {
            a.getIterator().forEachRemaining(val -> System.out.println(val));
        });
    }
}
