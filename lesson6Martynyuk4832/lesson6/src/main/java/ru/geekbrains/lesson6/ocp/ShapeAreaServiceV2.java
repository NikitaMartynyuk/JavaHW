package ru.geekbrains.lesson6.ocp;

import java.util.List;

public class ShapeAreaServiceV2 {

    public double calc(List<ShapeV2> shapes){
        double sumArea = 0;
        for (ShapeV2 shape : shapes) {
            sumArea += shape.getArea();
        }
        return sumArea;
    }

}
