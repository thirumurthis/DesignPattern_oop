package com.design.pattern;

import com.design.pattern.observers.Observer;
import com.design.pattern.observers.impl.CurrentWeather;
import com.design.pattern.subject.impl.WeatherData;

public class Main {
    public static void main (String ... args){
        WeatherData wd = new WeatherData();

        CurrentWeather cw = new CurrentWeather(wd);

        wd.setMeasurement(12f,13f,10f);
        cw.display();
        //Subject is now updated with different value
        wd.setMeasurement(20f,25f,20f);
        cw.display();

    }
}
