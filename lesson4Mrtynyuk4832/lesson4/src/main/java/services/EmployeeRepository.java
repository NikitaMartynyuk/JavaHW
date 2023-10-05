package services;

import ru.geekbrains.lesson4.Employee;

import java.util.List;

public interface EmployeeRepository extends Repository<Employee, Integer>{

    List<Employee> getByDepartmentId(int id);

}
