package ru.geekbrains.lesson3;

/**
 * Работник (базовый класс)
 */
public abstract class Employee implements Comparable<Employee> {

    /**
     * Имя
     */
    protected String name;

    /**
     * Фамилия
     */
    protected String surName;

    /**
     * Ставка заработной платы
     */
    protected double salary;

    public Employee(String surName, String name, double salary) {
        this.name = name;
        this.surName = surName;
        this.salary = salary;
    }

    /**
     * Расчет среднемесячной заработной платы
     * @return
     */
    public abstract double calculateSalary();

    @Override
    public int compareTo(Employee o) {
        int surNameRes = surName.compareTo(o.surName);
        if (surNameRes == 0){
            return name.compareTo(o.name);
        }
        return surNameRes;
    }
}

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        if (e1.getAge() < e2.getAge()) {
            return -1;
        } else if (e1.getAge() > e2.getAge()) {
            return 1;
        }
        return 0;
    }
}