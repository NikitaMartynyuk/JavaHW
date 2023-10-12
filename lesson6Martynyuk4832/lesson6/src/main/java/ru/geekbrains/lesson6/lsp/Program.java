package ru.geekbrains.lesson6.lsp;

import java.util.ArrayList;
import java.util.Arrays;

public class Program {

    // Тип S будет подтипом Т тогда и только тогда,
    // когда каждому объекту oS типа S соответствует некий объект oT типа T таким образом,
    // что для всех программ P,
    // реализованных в терминах T, поведение P не будет меняться, если oT заменить на oS.

    public static void main(String[] args) {


        Bird bird1 = new Bird(); // oT
        Bird bird2 = new Bird(); // oT
        Bird bird3 = new Bird(); // oT
        Duck duck1 = new Duck(); // oS
        Penguin penguin1 = new Penguin(); // oS
        penguin1.fly();

        ArrayList<Bird> list = new ArrayList<>(Arrays.asList(bird1, bird2, bird3 ));
        list.add(duck1);
        list.add(penguin1);
        processFly(list);
    }

    /**
     * P
     * @param birds
     */
    public static void processFly(ArrayList<Bird> birds){
        for (Bird bird : birds)
        {
            if (bird.isCanFly())
                bird.fly();
        }
    }

}
