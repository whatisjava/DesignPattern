package com.thxjava.dp.factory.abstractf;

import com.thxjava.dp.factory.Circle;
import com.thxjava.dp.factory.Rectangle;
import com.thxjava.dp.factory.Shape;
import com.thxjava.dp.factory.Square;

public class ShapeFactory extends AbstractFactory {
    public Color getColor(String color) {
        return null;
    }

    public Shape getShape(String shapeType) {
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
