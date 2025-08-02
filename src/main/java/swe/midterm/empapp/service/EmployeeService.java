package swe.midterm.empapp.service;

import java.util.List;

import swe.midterm.empapp.dao.Database;
import swe.midterm.empapp.model.Employee;

public class EmployeeService {

    public List<Employee> getAllEmployees() {
        return Database.INSTANCE.getEmployees();
    }

    public void addEmployee(Employee employee) {
        if (employee != null) {
            Database.INSTANCE.addEmployee(employee);
        }
    }

    public Employee getEmployeeById(int id) {
        return Database.INSTANCE.getEmployees().stream()
                .filter(emp -> emp.getId() == id)
                .findFirst()
                .orElse(null);
    }

    // get employees whose age is greater than a given age
    public List<Employee> getEmployeesOlderThan(int age) {
        return Database.INSTANCE.getEmployees().stream()
                .filter(emp -> emp.getAge() > age)
                .toList();
    }
}
