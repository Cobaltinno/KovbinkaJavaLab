package gr_4;

import java.time.LocalDate;
import java.util.Objects;

public class Employee implements Comparable<Employee>{

  
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
        private static final int MIN_NAME_LENGTH = 3;
        private static final int MAX_NAME_LENGTH = 50;
        private static final LocalDate MIN_DATE_OF_BIRTH = LocalDate.of(1900, 1, 1);
        private static final LocalDate MAX_DATE_OF_BIRTH = LocalDate.now().minusYears(18);
        private static final int MIN_POSITION_LENGTH = 3;
        private static final int MAX_POSITION_LENGTH = 50;

        private String name;
        private LocalDate dateOfBirth;
        private String position;

        public EmployeeBuilder(String name) {
            validateName(name);
            this.name = name;
        }

        public EmployeeBuilder dateOfBirth(LocalDate dateOfBirth) {
            validateDateOfBirth(dateOfBirth);
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public EmployeeBuilder position(String position) {
            validatePosition(position);
            this.position = position;
            return this;
        }

        public Employee build() {
            validateName(name);
            validateDateOfBirth(dateOfBirth);
            validatePosition(position);

            return new Employee(this);
        }

        private void validateName(String name) {
            if (name == null || name.length() < MIN_NAME_LENGTH || name.length() > MAX_NAME_LENGTH) {
                throw new IllegalArgumentException("Invalid name");
            }
        }

        private void validateDateOfBirth(LocalDate dateOfBirth) {
            if (dateOfBirth == null || dateOfBirth.isBefore(MIN_DATE_OF_BIRTH) || dateOfBirth.isAfter(MAX_DATE_OF_BIRTH)) {
                throw new IllegalArgumentException("Invalid date of birth");
            }
        }

        private void validatePosition(String position) {
            if (position == null || position.length() < MIN_POSITION_LENGTH || position.length() > MAX_POSITION_LENGTH) {
                throw new IllegalArgumentException("Invalid position");
            }
        }
    }
}
