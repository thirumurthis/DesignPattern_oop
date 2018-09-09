package com.duck.behaviour.impl;

import com.duck.behaviour.FlyBehaviour;

public class FlyNot implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Cannot fly now...");
    }
}
