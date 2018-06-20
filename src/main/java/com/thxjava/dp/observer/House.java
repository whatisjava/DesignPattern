package com.thxjava.dp.observer;

import java.util.Observable;

// 被观察者
public class House extends Observable {

    private float price;

    public House(float price){
        this.price = price;
    }

    public float getPrice(){
        return this.price;
    }

    public void setPrice(float price){
        super.setChanged(); // 告知数据改变
        super.notifyObservers(price); // 发送信号通知观察者
        this.price = price;
    }

    @Override
    public String toString() {
        return "房子价格为：" + getPrice();
    }

}
