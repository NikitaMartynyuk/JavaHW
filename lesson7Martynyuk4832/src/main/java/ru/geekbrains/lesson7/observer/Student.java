package ru.geekbrains.lesson7.observer;

public class Student implements Observer{

    private String name;
    private int salary = 2000;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public <VacancyType> void receiveOffer(String nameCompany, VacancyType vacancyType, int salary) {
        if (this.salary <= salary){
            System.out.printf("Студент %s: Мне нужна эта работа! (компания: %s; тип вакансии: %s; заработная плата: %d)\n",
                    (Object) name, nameCompany, vacancyType, salary);
            this.salary = salary;
        }
        else {
            System.out.printf("Студент %s: Я найду работу получше! (компания: %s; тип вакансии: %s; заработная плата: %d)\n",
                    name, nameCompany, vacancyType, salary);
        }
    }
}
