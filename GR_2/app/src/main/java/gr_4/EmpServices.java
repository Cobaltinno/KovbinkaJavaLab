package gr_4;

import jakarta.validation.Validator;
import gr_2.Employee;

import java.time.LocalDate;
import java.util.*;

public class EmpServices implements EmpService {

    private List<Employee> employes;

    public EmpServices(List<Employee> employes){
        this.employes = employes;
    }


    @Override
    public List<Employee> sortEmployeeByName() {
        List<Employee> result = new ArrayList<>(employes);
        result.sort(Comparator.comparing(Employee::getName));
        return result;
    }

    @Override
    public List<Employee> sortEmployeeByDateOfBirth() {
        List<Employee> result = new ArrayList<>(employes);
        result.sort(Comparator.comparing(Employee::getDateOfBirth));
        return result;
    }

    @Override
    public List<Employee> getByPartName(String name) {
        SortedSet<Employee> matchingEmployee = new TreeSet<>();

        for (Employee employee : employes) {
            if (employee.getName().contains(name)) {
                matchingEmployee.add(employee);
            }
        }

       // Collections.sort(matchingAthletes);
        return new ArrayList<>(matchingEmployee);
    }

}