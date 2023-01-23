package model.data;

import java.time.LocalDate;
import java.util.*;

public class Student {
    private String name;
    private Map<LocalDate, Boolean> attendance;

    public Student(String name, Map<LocalDate, Boolean> attendance) {
        this.name = name;
        this.attendance = attendance;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", attendance=" + attendance + "]";
    }

    public String getName() {
        return name;
    }

    public Map<LocalDate, Boolean> getAttendance() {
        return attendance;
    }

}