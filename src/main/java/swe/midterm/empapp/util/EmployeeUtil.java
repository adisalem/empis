package swe.midterm.empapp.util;

import java.util.Comparator;
import java.util.List;

import swe.midterm.empapp.dto.EmployeeViewDto;

public class EmployeeUtil {


    public static List<EmployeeViewDto> filterByAge(List<EmployeeViewDto> employees,int age) {
        return employees.stream()
                .filter(employee -> employee.getAge() >=age)
                .toList();
    }
    public static List<EmployeeViewDto> sortByNameAgeSalary(List<EmployeeViewDto> employees){
        return employees.stream()
            .sorted(Comparator.comparing(EmployeeViewDto::getName)
                    .thenComparing(EmployeeViewDto::getAge, Comparator.reverseOrder())
                    .thenComparing(EmployeeViewDto::getSalary, Comparator.reverseOrder()))
            .toList();
    }
}
