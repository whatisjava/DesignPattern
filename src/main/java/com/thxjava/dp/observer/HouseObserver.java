package com.thxjava.dp.observer;

import java.util.Observable;
import java.util.Observer;

// 观察者
public class HouseObserver implements Observer {

    private String name; // 观察者的名字

    public HouseObserver(String name){
        this.name = name; // 设置每一个购房者的名字
    }

    public void update(Observable o, Object arg) {
        if (arg instanceof Float) {
            System.out.println(this.name + "观察到房价变为：" + ((Float)arg).floatValue());
        }
    }

}
