package com.design.pattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BreakfastMenu implements Menu {
    List<String> array = new ArrayList<String>();
    public BreakfastMenu(){
        array.add("BreakFast1 : Coffee");
        array.add("BreakFast1 : Roll");
    }
    public Iterator getIterator() {
        return array.iterator();
    }
}
