package swe.midterm.empapp.dto;

import swe.midterm.empapp.model.Employee;

public class EmployeeViewDto {
    private String name;
    private int age;
    private double salary;

    public EmployeeViewDto() {}

    public EmployeeViewDto(Employee employee) {
        this.name = employee.getName();
        this.age = employee.getAge();
        this.salary = employee.getSalary();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

}