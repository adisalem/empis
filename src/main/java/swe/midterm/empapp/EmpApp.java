package swe.midterm.empapp;

import java.util.List;

import swe.midterm.empapp.dto.EmployeeViewDto;
import swe.midterm.empapp.service.EmployeeService;
import swe.midterm.empapp.util.EmployeeUtil;
import swe.midterm.empapp.util.JsonConverter;

public class EmpApp {
    public static void main(String[] args) {
        var emplist = getAllEmployees();

        var filterByAge = EmployeeUtil.filterByAge(emplist, 30);
        var sortedList = EmployeeUtil.sortByNameAgeSalary(filterByAge);

        try {
            String json = JsonConverter.toJson(sortedList);
            System.out.println("JSON Representation: " + json);
        } catch (Exception e) {
            System.err.println("Error converting to JSON: " + e.getMessage());
        }
    }

    public static List<EmployeeViewDto> getAllEmployees() {
        EmployeeService employeeService = new EmployeeService();
        return employeeService.getAllEmployees().stream()
                .map(e -> new EmployeeViewDto(e))
                .toList();
    }
}