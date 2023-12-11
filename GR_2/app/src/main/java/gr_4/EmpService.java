package gr_4;

import gr_2.Employee;

import java.util.List;

public interface EmpService {
    List<Employee> sortEmployeeByName();
    List<Employee> sortEmployeeByDateOfBirth();
    List<Employee> getByPartName(String name);

}