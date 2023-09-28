public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false; // изначально кот голоден
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void eat(Plate plate) {
        if (plate.getFood() >= appetite) {
            plate.decreaseFood(appetite);
            satiety = true;
        } else {
            System.out.println("Кот " + name + " не может покушать, так как в тарелке недостаточно еды.");
        }
    }
}

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int amount) {
        if (food >= amount) {
            food -= amount;
        } else {
            System.out.println("Недостаточно еды в тарелке!");
        }
    }

    public int getFood() {
        return food;
    }

    public void info() {
        System.out.println("В тарелке: " + food + " единиц еды.");
    }
}

public class MainClass {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 5);
        Plate plate = new Plate(10);
        plate.info();

        cat.eat(plate);
        plate.info();
        System.out.println("Кот сыт: " + cat.isSatiety());
    }
}