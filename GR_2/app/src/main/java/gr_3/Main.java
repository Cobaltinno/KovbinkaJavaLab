package gr_3;

import gr_2.Employee;

import java.io.IOException;
import java.time.LocalDate;

public class Main {
    JsonS jsonS = new JsonS();
    public static void main(String[] args) throws IOException {
        Employee employee = new Employee.EmployeeBuilder("Andrew")
                .dateOfBirth(LocalDate.of(2000, 10, 10))
                .Position("Decision maker")
                .build();

                Serializer TxtS = new TxtS();
                TxtS.serialize(employee, "employee.txt");
                Employee txtdeserialized = TxtS.deserialize("employee.txt", Employee.class);

                Serializer jsonS = new JsonS();
                jsonS.serialize(employee, "employee.json");
                Employee deserializedAth = jsonS.deserialize("athlete.json", Employee.class);


                Serializer XmlS = new XmlS();
                XmlS.serialize(employee, "employee.xml");
                Employee deserialized = XmlS.deserialize("employee.xml", Employee.class);
            }
}