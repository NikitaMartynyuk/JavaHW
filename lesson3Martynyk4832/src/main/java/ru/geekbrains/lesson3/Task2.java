package ru.geekbrains.lesson3;

import java.util.Arrays;
import java.util.Random;

public class Task2 {

    static Random random = new Random();

    static Employee generateEmployee(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };


        int salary = random.nextInt(50000, 110000);

        if (random.nextBoolean()) {
            return new Worker(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)], salary);
        } else {
            int hoursWorked = random.nextInt(10, 40);
            int hourlyRate = random.nextInt(2000, 5000);
            return new Freelancer(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)], hoursWorked, hourlyRate);
        }
    }

    /**
     * TODO: Переработать метод generateEmployees. Метод должен возвращать массив сотрудников
     *  разных типов (Worker, Freelancer), метод должен быть ОДИН!
     * @param count
     * @return
     */
    static Employee[] generateEmployees(int count) {
        Employee[] employees = new Employee[count];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = generateEmployee();
        }
        return employees;
    }

    public static void main(String[] args) {
        Employee[] employees = generateEmployees(15);

        Arrays.sort(employees, new SalaryComparator(SortType.Ascending));
        System.out.println("Ascending order:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println();

        Arrays.sort(employees, new SalaryComparator(SortType.Descending));
        System.out.println("Descending order:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
