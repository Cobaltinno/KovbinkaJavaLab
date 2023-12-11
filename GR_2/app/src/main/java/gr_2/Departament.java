package gr_2;

import gr_2.Employee;
import gr_2.Task;

class Departament{
    private Task task;

    private String dname;

    private Employee employee;

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public String getName() {
        return dname;
    }

    public void setName(String dname) {
        this.dname = dname;
    }

    public Employee getAEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Departament{" +
                "task=" + task +
                ", name=" + dname +
                ", Employee=" + employee +
                '}';
    }

}