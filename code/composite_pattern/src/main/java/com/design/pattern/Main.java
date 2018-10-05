package com.design.pattern;

import java.util.ArrayList;

public class Main {

    public  static void main(String ...args){
        MenuComponent lunchMenu = new MenuItemComposite("Lunch Menu",10);
        MenuComponent bfMenu = new MenuItemComposite("Breakfast Menu",10);
        MenuComponent dinnerMenu = new MenuItemComposite("dinner Menu",10);
        MenuComponent desertMenu = new MenuItemComposite("desert Menu",10);
        MenuComponent allMenu = new MenuItemComposite("All Menu", 10);
        dinnerMenu.add(desertMenu);
        desertMenu.add(new MenuItemComposite("desert Menu 2",10));
        allMenu.add(bfMenu);
        allMenu.add(lunchMenu);
        allMenu.add(dinnerMenu);
        Waitress waitress = new Waitress(allMenu);
        waitress.printMenu();
    }
}
