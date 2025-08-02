package swe.midterm.empapp.model;

import java.time.LocalDate;

public class Employee {
    private int id;
    private String name;
    private LocalDate dateOfBirth;
    private double salary;

    public Employee(int id, String name, LocalDate dateOfBirth, double salary) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public double getSalary() {
        return salary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", salary=" + salary +
                '}';
    }
}
