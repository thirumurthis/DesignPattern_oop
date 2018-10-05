package com.design.pattern;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LunchMenu implements Menu {

    Map<String,String> lMenu = new HashMap<>();
    public LunchMenu(){
        lMenu.put("dish1","Lunch1: Pasta");
        lMenu.put("dish2","Lunch2: salad");
    }
    public Iterator getIterator() {
        return lMenu.values().iterator();
    }
}
