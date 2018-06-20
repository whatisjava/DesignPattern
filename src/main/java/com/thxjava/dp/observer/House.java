package com.thxjava.dp.observer;

import java.util.Observable;

// 被观察者
public class House extends Observable { // 表示房子可以被观察

    private float price; // 价钱

    public House(float price){
        this.price = price;
    }

    public float getPrice(){
        return this.price;
    }

    public void setPrice(float price){ // 每一次修改的时候都应该引起观察者的注意
        super.setChanged(); // 告知数据改变 设置变化点
        super.notifyObservers(price); // 发送信号通知观察者价格被改变
        this.price = price;
    }

    @Override
    public String toString() {
        return "房子价格为：" + getPrice();
    }

}
