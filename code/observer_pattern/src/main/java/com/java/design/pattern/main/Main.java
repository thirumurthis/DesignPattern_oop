package com.java.design.pattern.main;

import com.java.design.pattern.observer.CurrentWeather;
import com.java.design.pattern.subject.WeatherData;

public class Main {

    public static void main(String ...args){

        WeatherData wd = new WeatherData();
        //The order of registering the observer object is crucial
        //Accidentally i used this after line 14 nothing was printed
        CurrentWeather cw = new CurrentWeather(wd);
        wd.setMeasurements(12f,12f,12f);
        //  cw.display();

    }
}
