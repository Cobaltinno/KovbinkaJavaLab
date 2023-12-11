package gr_4;

import gr_2.Employee;
import gr_2.Task;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmpServiceStream implements EmpService{

    private List<Employee> employes;

    public EmpServiceStream(List<Employee> employes){
        this.employes = employes;
    }

    @Override
    public List<Employee> sortEmployeeByName() {
        List<Employee> result = new ArrayList<>(employes);
        return result.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());
    }

    @Override
    public List<Employee> sortEmployeeByDateOfBirth() {
        List<Employee> result = new ArrayList<>(employes);
        return result.stream()
                .sorted(Comparator.comparing(Employee::getDateOfBirth))
                .collect(Collectors.toList());
    }

        @Override
        public List<Employee> getByPartName(String name) {
            List<Employee> result = new ArrayList<>(employes);
            return result.stream()
                    .filter(athlete -> athlete.getName().contains(name))
                    .sorted()
                    .collect(Collectors.toList());
    }
}