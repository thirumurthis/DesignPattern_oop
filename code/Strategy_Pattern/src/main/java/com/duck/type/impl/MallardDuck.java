package com.duck.type.impl;

import com.duck.behaviour.FlyBehaviour;
import com.duck.behaviour.QuackBehaviour;
import com.duck.behaviour.impl.FlyWithWings;
import com.duck.behaviour.impl.Quack;
import com.duck.type.Duck;

public class MallardDuck extends Duck {

    public MallardDuck(){
        FlyBehaviour flyBehaviour = new FlyWithWings();
        QuackBehaviour quackBehaviour = new Quack();
    }

    @Override
    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        super.setFlyBehaviour(flyBehaviour);
    }

    @Override
    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        super.setQuackBehaviour(quackBehaviour);
    }
}
