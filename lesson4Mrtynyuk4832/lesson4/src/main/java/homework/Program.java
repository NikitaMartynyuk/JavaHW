package homework;

public class Program {

    /*
    a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
    b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
    поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
    c. Для хранения фруктов внутри коробки можно использовать ArrayList;
    d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
    вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
    e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
    подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
    Можно сравнивать коробки с яблоками и апельсинами;
    f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
    Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
    Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
    g. Не забываем про метод добавления фрукта в коробку.

    Формат сдачи: ссылка на гитхаб проект*/
    public static void main(String[] args) {
            Box<Apple> appleBox1 = new Box<>();
            appleBox1.addFruit(new Apple());
            appleBox1.addFruit(new Apple());
            appleBox1.addFruit(new Apple());

            Box<Apple> appleBox2 = new Box<>();
            appleBox2.addFruit(new Apple());
            appleBox2.addFruit(new Apple());

            Box<Orange> orangeBox = new Box<>();
            orangeBox.addFruit(new Orange());
            orangeBox.addFruit(new Orange());
            orangeBox.addFruit(new Orange());

            System.out.println("Apple box 1 weight: " + appleBox1.getWeight());
            System.out.println("Apple box 2 weight: " + appleBox2.getWeight());
            System.out.println("Orange box weight: " + orangeBox.getWeight());

            System.out.println("Is apple box 1 equal to apple box 2? " + appleBox1.compare(appleBox2));
            System.out.println("Is apple box 1 equal to orange box? " + appleBox1.compare(orangeBox));

            Box<Fruit> fruitBox = new Box<>();
            appleBox1.transferFruits(fruitBox);

            System.out.println("Apple box 1 weight: " + appleBox1.getWeight());
            System.out.println("Fruit box weight: " + fruitBox.getWeight());
        }
    }


