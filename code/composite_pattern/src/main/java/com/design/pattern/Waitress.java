package com.design.pattern;

public class Waitress {

    MenuComponent allMenu;

    public Waitress (MenuComponent allMenu){
        this.allMenu = allMenu;
    }

    void printMenu(){
        allMenu.print();
    }
}
