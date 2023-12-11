package gr_4;

import gr_2.Employee;
import gr_2.Task;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee.EmployeeBuilder("Jack")
                .dateOfBirth(LocalDate.of(1992, 1, 1))
                .Position("worker")
                .build();
        Employee employee2 = new Employee.EmployeeBuilder("Joseph")
                .dateOfBirth(LocalDate.of(1920, 9, 27))
                .Position("worker")
                .build();
        Employee employee3 = new Employee.EmployeeBuilder("Jack")
                .dateOfBirth(LocalDate.of(1982, 1, 1))
                .Position("hardworker")
                .build();


        Task JV = new Task("Java", 43);
        Task OP = new Task("Operating system", 100);
        Task WB = new Task("WEB", 15);

        List<Employee> employes = new ArrayList<>();
        employes.add(employee1);
        employes.add(employee2);
        employes.add(employee3);

        System.out.println("Unsorted employee:");
        employes.forEach(employee-> System.out.println(employee.getName() + " - " + employee.getDateOfBirth()+ " - " + employee.getPos()));

        // Create an instance of SchoolService1
        EmpServices empServices = new EmpServices(employes);

        // Test sorting by name
        System.out.println("Sorted by name:");
        empServices.sortAthleteByName().forEach(employee -> System.out.println(employee.getName()));

        // Test sorting by date of birth
        System.out.println("\nSorted by date of birth:");
        empServices.sortAthleteByDateOfBirth().forEach(employee -> System.out.println(employee.getName()));

        // Test filtering by part of the name
        System.out.println("\nFiltered by part of the name:");
        empServices.getByPartName("Ol").forEach(employee -> System.out.println(employee.getName()));

    }
}