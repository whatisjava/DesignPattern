package com.thxjava.dp.factory.abstractf;

import com.thxjava.dp.factory.Shape;

public class ColorFactory extends AbstractFactory {
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }

    public Shape getShape(String shape) {
        return null;
    }
}
