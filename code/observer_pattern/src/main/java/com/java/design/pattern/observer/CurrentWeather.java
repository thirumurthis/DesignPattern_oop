package com.java.design.pattern.observer;

import com.java.design.pattern.subject.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class CurrentWeather implements Observer {

    Observable observable;
    public float temperature;
    public float pressure;
    public float humidity;

    public CurrentWeather(Observable observable){
        this.observable=observable;
        observable.addObserver(this);
    }

    public void update(Observable obs,Object arg){
        if (obs instanceof WeatherData){
            WeatherData wd = (WeatherData)obs;
            this.temperature=wd.getTemperature();
            this.humidity = wd.getHumidity();
            this.pressure = wd.getPressure();
            display();
        }
    }

    public void display(){
        System.out.println("temp : pressure : humidty "+temperature+":"+pressure+":"+humidity);
    }
}
