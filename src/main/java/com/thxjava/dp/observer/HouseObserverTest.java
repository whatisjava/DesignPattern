package com.thxjava.dp.observer;

public class HouseObserverTest {

    public static void main(String[] args) {
        House house = new House(10000);

        HousePriceObserver observer1 = new HousePriceObserver("购房者A");
        HousePriceObserver observer2 = new HousePriceObserver("购房者B");
        HousePriceObserver observer3 = new HousePriceObserver("购房者C");

        house.addObserver(observer1);
        house.addObserver(observer2);
        house.addObserver(observer3);

        System.out.println(house);

        house.setPrice(15000);

        System.out.println(house);
    }
}
