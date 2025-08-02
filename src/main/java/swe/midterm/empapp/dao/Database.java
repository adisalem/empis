package swe.midterm.empapp.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import swe.midterm.empapp.model.Employee;

public enum Database {

    INSTANCE;

    private final List<Employee> employees;

    private Database() {
        employees = new ArrayList<>();
        loadSampleData();
    }

    private void loadSampleData() {
        if (employees.isEmpty()) {
            employees.add(new Employee(1, "Alice", LocalDate.of(1990, 1, 15), 50000));
            employees.add(new Employee(2, "Bob", LocalDate.of(1985, 5, 20), 60000));
            employees.add(new Employee(3, "Charlie", LocalDate.of(1992, 3, 10), 55000));
        }
    }

    public List<Employee> getEmployees() {
        if (employees == null || employees.isEmpty()) {
            loadSampleData();
        }
        return employees;
    }

    public void addEmployee(Employee employee)
    {
        if (employee != null) {
            employees.add(employee);
        }
    }
}