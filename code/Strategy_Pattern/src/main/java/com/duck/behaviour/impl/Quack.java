package com.duck.behaviour.impl;

import com.duck.behaviour.QuackBehaviour;

public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("this duck quacks");
    }
}
