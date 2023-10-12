package ru.geekbrains.lesson6.srp1;

public class Program {

    public static void main(String[] args) {

        SquareV2 squareV2 = new SquareV2(new Point(1,1), 5);
        System.out.printf("Площадь фигуры: %d\n", squareV2.getArea());
        SquareDrawer squareDrawer = new SquareDrawer(squareV2);
        squareDrawer.draw();
        squareDrawer.setScale(3);
        squareDrawer.draw();

        //Square square = new Square(new Point(1,1), 5);
        //System.out.printf("Площадь фигуры: %d\n", square.getArea());
        //square.draw();



    }

}
