package gr_2;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Departament Gde = new Departament();
        Task deadlift = new Task("Finish exercise with Java", 367);

          Employee employee = new Employee.EmployeeBuilder("Oleksii")
                .dateOfBirth(LocalDate.of(2004, 3, 30))
                .Position("Head of stupid decision")
                .build();

        Departament position = new Departament();
        position.setTask(deadlift);
        position.setEmployee(employee);
        position.setName("Computer science dep.");

        System.out.println(position);
    }
}