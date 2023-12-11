package gr_2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Employee implements Comparable<Employee>{

    public String getName() {
        return name;
    }

    public String getPos() {
        return position;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setPos(String name) {
        this.position = position;
    }
  
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    private String name;
    private String position;
    private LocalDate dateOfBirth;

    private Employee(EmployeeBuilder builder) {
        this.name = builder.name;
        this.dateOfBirth = builder.dateOfBirth;
        this.position = builder.position;
    }

    private Employee (){
    }

    @Override
    public String toString() {
        return "Employee name = " + name + ", age = " + dateOfBirth+", position = " + position;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return dateOfBirth == employee.dateOfBirth && Objects.equals(name, employee.name)&& Objects.equals(position, employee.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dateOfBirth, position);
    }

    @Override
    public int compareTo(Employee Employee) {
        return this.name.compareTo(Employee.name);
    }

    public static class EmployeeBuilder {
        private String name;
        private LocalDate dateOfBirth;
        private String position;

        public EmployeeBuilder(String name) {
            this.name = name;
        }

        public EmployeeBuilder dateOfBirth(LocalDate dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public EmployeeBuilder Position(String position) {
            this.position = position;
            return this;
        }
        public Employee build() {
            return new Employee(this);
        }
    }
}