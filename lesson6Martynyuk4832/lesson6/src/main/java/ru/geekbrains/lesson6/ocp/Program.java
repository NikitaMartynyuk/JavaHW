package ru.geekbrains.lesson6.ocp;

import java.util.ArrayList;
import java.util.List;

public class Program {


    public static void main(String[] args) {
        List<ShapeV2> shapes = new ArrayList<>();
        shapes.add(new RightTriangleV2(2, 3));
        shapes.add(new SquareV2(4));
        shapes.add(new CircleV2(5));
        ShapeAreaServiceV2 shapeAreaService = new ShapeAreaServiceV2();
        System.out.printf("Сумма площадей фигур равна %.2f \n", shapeAreaService.calc(shapes));
       /* List<Shape> shapes = new ArrayList<>();
        shapes.add(new RightTriangle(2, 3));
        shapes.add(new Square(4));
        shapes.add(new Circle(5));
        ShapeAreaService shapeAreaService = new ShapeAreaService();
        System.out.printf("Сумма площадей фигур равна %.2f \n", shapeAreaService.calc(shapes));
*/

    }

}
