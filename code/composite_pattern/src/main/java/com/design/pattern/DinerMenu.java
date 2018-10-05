package com.design.pattern;

import java.util.ArrayList;

public class DinerMenu implements Menu {

    ArrayList<String> dinnerMenu = new ArrayList<>();
    public DinerMenu(){
        dinnerMenu.add("Dinner : Burger");
    }
}
