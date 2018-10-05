package com.design.pattern;

import java.util.ArrayList;

public class DesertMenu implements Menu{
    ArrayList<String> desertMenu = new ArrayList<>();

    public DesertMenu(){
        desertMenu.add("Desert : icecream");
        desertMenu.add("Desert : milkshake");
    }
}
