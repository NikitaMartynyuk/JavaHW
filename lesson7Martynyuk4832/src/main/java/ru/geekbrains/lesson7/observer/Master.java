package ru.geekbrains.lesson7.observer;

import java.util.Optional;

public class Master implements Observer{

    private String name;
    private int salary = 80000;

    public Master(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String nameCompany, VacancyType vacancyType, int salary) {
        if (this.salary <= salary){
            System.out.printf("Специалист %s: Мне нужна эта работа! (компания: %s; тип вакансии: %s; заработная плата: %d)\n",
                    (Object) name, nameCompany, vacancyType, salary);
            this.salary = salary;
        }
        else {
            System.out.printf("Специалист %s: Я найду работу получше! (компания: %s; тип вакансии: %s; заработная плата: %d)\n",
                    (Object) name, Optional.ofNullable(nameCompany), vacancyType, salary);
        }
    }
}
