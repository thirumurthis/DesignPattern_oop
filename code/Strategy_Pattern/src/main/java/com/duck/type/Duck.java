package com.duck.type;

import com.duck.behaviour.FlyBehaviour;
import com.duck.behaviour.QuackBehaviour;
import com.duck.behaviour.impl.FlyWithWings;
import com.duck.behaviour.impl.Quack;

public abstract class Duck {
//constructor
    public Duck(){}

    private FlyBehaviour flyBehaviour = new FlyWithWings();
    private QuackBehaviour quackBehaviour = new Quack();

    public FlyBehaviour getFlyBehaviour() {
        return flyBehaviour;
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public QuackBehaviour getQuackBehaviour() {
        return quackBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
public void performFly(){
        flyBehaviour.fly();
}

public void performQuack(){
        quackBehaviour.quack();
}

}
