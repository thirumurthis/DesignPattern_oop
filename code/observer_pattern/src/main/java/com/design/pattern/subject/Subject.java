package com.design.pattern.subject;

import com.design.pattern.observers.Observer;

public interface Subject {

    public void registerObserver(Observer o);
    public void removeObserver (Observer o);
    public void notifyObserver ();
}
