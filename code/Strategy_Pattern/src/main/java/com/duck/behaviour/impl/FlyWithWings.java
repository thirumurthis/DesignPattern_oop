package com.duck.behaviour.impl;

import com.duck.behaviour.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("fly with wings..");
    }
}
