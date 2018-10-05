package com.design.pattern;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class LunchMenu implements Menu {

    ArrayList<String > lunchMenu = new ArrayList<>();
    public LunchMenu(){
        lunchMenu.add("Lunch : Salad");
        lunchMenu.add("Lunch : Pasta");
    }
}
