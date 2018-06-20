package com.thxjava.dp.observer;

import java.util.ArrayList;
import java.util.List;

// 具体被观察者
public class TeacherSubject implements Subject {

    //用来存放和记录观察者
    private List<Observer> observers = new ArrayList<Observer>();

    //记录状态的字符串
    private String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void addObserver(Observer obj) {
        observers.add(obj);
    }

    public void deleteObserver(Observer obj) {
        int i = observers.indexOf(obj);
        if (i >= 0){
            observers.remove(obj);
        }
    }

    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

}
