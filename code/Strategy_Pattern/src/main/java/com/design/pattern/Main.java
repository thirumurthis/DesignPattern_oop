package com.design.pattern;

import com.duck.behaviour.impl.FlyNot;
import com.duck.behaviour.impl.FlyWithWings;
import com.duck.type.impl.MallardDuck;

public class Main {
    public static void main(String ... args){

        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        mallardDuck.setFlyBehaviour(new FlyNot());
        mallardDuck.performFly();
    }
}
