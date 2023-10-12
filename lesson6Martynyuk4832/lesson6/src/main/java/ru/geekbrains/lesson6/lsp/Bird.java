package ru.geekbrains.lesson6.lsp;


/**
 * T
 */
public class Bird {

    private int flySpeed = 10;

    private boolean isCanFly = true;


    public Bird(){

    }

    public Bird(boolean isCanFly) {
        this.isCanFly = isCanFly;
    }

    public boolean isCanFly() {
        return isCanFly;
    }

    public int getFlySpeed() {
        return flySpeed;
    }

    public void fly() {
        System.out.printf("Птица летит со скоростью %d км/ч\n", flySpeed);
    }

}
