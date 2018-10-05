package com.design.pattern;

public class ClientTest {

    public static void main(String... args){
        Duck mallardDuck = new MallardDuck();
        Turkey wildTurkey = new WildTurkey();
        TurkeyAdapter adapting = new TurkeyAdapter(wildTurkey);

        mallardDuck.fly();
        mallardDuck.quack();
        adapting.fly();
        adapting.quack();
    }
}
