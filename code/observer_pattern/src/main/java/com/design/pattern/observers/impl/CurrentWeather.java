package com.design.pattern.observers.impl;

import com.design.pattern.display.Display;
import com.design.pattern.observers.Observer;
import com.design.pattern.subject.Subject;

public class CurrentWeather implements Observer, Display {
    public Subject weatherData;
    public float temperature;
    public float pressure;
    public float humidity;

    //registering the observer to the subject using constructor
    public CurrentWeather(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature=temperature;
        this.pressure = pressure;
        this.humidity=humidity;
    }

    //this can be extracted from an display interface using implements
    @Override
    public void display(){
        System.out.println("temp : pressure : humidty "+temperature+":"+pressure+":"+humidity);
    }
}
