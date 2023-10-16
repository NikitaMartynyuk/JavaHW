package ru.geekbrains.lesson7.observer;

public interface Observer {

    void receiveOffer(String nameCompany, VacancyType vacancyType, int salary);

    <VacancyType> void receiveOffer(String nameCompany, VacancyType vacancyType, int salary);
}
