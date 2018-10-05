package com.design.pattern;

public class MenuLeaf extends MenuComponent{

    String description;
    int price;
    public MenuLeaf (String description, int price ){
        this.description=description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice(){
        return price;
    }

    public void print(){
        System.out.print( " Menu : "+getDescription()+"  "+getPrice());
    }
}
