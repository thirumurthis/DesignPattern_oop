package com.design.pattern;

public class TurkeyAdapter implements Duck {
    Turkey wildTurkey;

    public TurkeyAdapter(Turkey wildTurkey){
        this.wildTurkey = wildTurkey;
    }
    public void fly() {
        wildTurkey.fly();
    }

    public void quack() {
        wildTurkey.gobble();
    }
}
