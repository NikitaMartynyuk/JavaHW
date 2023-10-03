package ru.geekbrains.lesson3;

/**
 * TODO: Разработать тип Freelancer самостоятельно в рамках выполнения
 *  домашней работы
 * Фрилансер (работник с почасовой оплатой)
 */
public class Freelancer {
    def __init__(self, hourly_rate: float):
    self.hourly_rate = hourly_rate

    def calculate_monthly_salary(self):
    monthly_salary = 20.8 * 8 * self.hourly_rate
        return monthly_salary


    class Employee:
    def __init__(self, monthly_salary: float):
    self.monthly_salary = monthly_salary

    def calculate_monthly_salary(self):
            return self.monthly_salary


# Пример использования
    freelancer = Freelancer(15)
    monthly_salary_freelancer = freelancer.calculate_monthly_salary()
    print(f"Среднемесячная заработная плата фрилансера: {monthly_salary_freelancer}")

    employee = Employee(4000)
    monthly_salary_employee = employee.calculate_monthly_salary()
    print(f"Среднемесячная заработная плата сотрудника: {monthly_salary_employee}")
}

