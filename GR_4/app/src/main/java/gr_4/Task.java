package gr_4;

import java.util.Objects;

public class Task {
    private String name;
    private float hour_to_fin ;

    public Task(String name, float hour_to_fin) {
        this.name = name;
        this.hour_to_fin = hour_to_fin;
    }


    @Override
    public String toString() {
        return "Task name= '" + name + "', Hours to complete = " + hour_to_fin;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Task subject = (Task) obj;
        return hour_to_fin == subject.hour_to_fin && Objects.equals(name, subject.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, hour_to_fin);
    }

    public Object getName() {
        return this.name;
    }
}