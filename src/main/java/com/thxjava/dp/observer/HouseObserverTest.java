package com.thxjava.dp.observer;

public class HouseObserverTest {

    public static void main(String[] args) {
        House house = new House(10000);

        HouseObserver observer1 = new HouseObserver("购房者A");
        HouseObserver observer2 = new HouseObserver("购房者B");
        HouseObserver observer3 = new HouseObserver("购房者C");

        house.addObserver(observer1);
        house.addObserver(observer2);
        house.addObserver(observer3);

        System.out.println(house);

        house.setPrice(15000);

        System.out.println(house);
    }
}
