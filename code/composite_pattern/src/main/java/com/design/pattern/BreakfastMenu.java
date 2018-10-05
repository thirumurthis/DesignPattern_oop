package com.design.pattern;

import java.util.ArrayList;

public class BreakfastMenu implements Menu {

    ArrayList<String> bfMenu = new ArrayList<>();

    public BreakfastMenu(){
        bfMenu.add("Breakfast : Coffee");
        bfMenu.add("Breakfast : Roll");
    }
}
