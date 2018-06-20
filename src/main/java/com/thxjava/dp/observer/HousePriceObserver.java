package com.thxjava.dp.observer;

import java.util.Observable;
import java.util.Observer;

// 观察者
public class HousePriceObserver implements Observer {

    private String name;

    public HousePriceObserver(String name){
        this.name = name;
    }

    public void update(Observable o, Object arg) {
        if (arg instanceof Float) {
            System.out.println(this.name + "观察到房价变为：" + ((Float)arg).floatValue());
        }
    }

}
