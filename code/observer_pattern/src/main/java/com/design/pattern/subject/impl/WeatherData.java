package com.design.pattern.subject.impl;

import com.design.pattern.observers.Observer;
import com.design.pattern.subject.Subject;

import java.util.ArrayList;

public class WeatherData implements Subject {

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    float temperature;
    float pressure;
    float humidity;

    ArrayList<Observer> observerList = new ArrayList<>();
    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    public void removeObserver(Observer o) {
        int index = observerList.indexOf(0);
        if(index >0 ){
            observerList.remove(o);
        }
    }

    public void notifyObserver() {
        for(Observer observer : observerList){
            observer.update(temperature,pressure,humidity);
        }
    }
    private void measurementChanged(){
        notifyObserver();
    }
    public void setMeasurement(float temperature,float pressure, float humidity){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        measurementChanged();
    }
}
