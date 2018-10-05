package com.design.pattern;

import java.util.ArrayList;

public class Main {

    public static void main(String ...args){
        Menu bfMenu = new BreakfastMenu();
        Menu lunchMenu = new LunchMenu();

        ArrayList<Menu> menuList = new ArrayList<>();
        menuList.add(bfMenu);
        menuList.add(lunchMenu);

        Waitress waitress = new Waitress(menuList);
        waitress.printMenu();
    }
}
