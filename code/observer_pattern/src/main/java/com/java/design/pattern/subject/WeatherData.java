package com.java.design.pattern.subject;

import java.util.Observable;

public class WeatherData extends Observable {

    public float temperature;
    public float pressure;
    public float humidity;
    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }



    public  void measurementChanged(){
        //setChanged method will set a flag to true.
        //with the set changeFlag, te notifyObservers will be sent information.
        //this is used for more control, suppose if we need to send or update
        //the weather for 30 minutes, we could use this flag logically
        // see hasChanged() which returns current state of the flag

        setChanged(); // this is used for control reason

        notifyObservers(this);
    }

    public void setMeasurements(float temperature, float pressure, float humidity){
        this.temperature= temperature;
        this.pressure=pressure;
        this.humidity= humidity;
        measurementChanged();
    }
}
