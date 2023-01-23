package model.service;

import java.time.LocalDate;
import java.util.*;

import model.data.Student;

public class StudentService {

    public List<Student> makeStudents() {
        Map<LocalDate, Boolean> attendanceIvan = new HashMap<>();
        attendanceIvan.put(LocalDate.parse("2020-10-19"), true);
        attendanceIvan.put(LocalDate.parse("2020-10-20"), true);
        attendanceIvan.put(LocalDate.parse("2020-10-21"), false);
        attendanceIvan.put(LocalDate.parse("2020-10-22"), true);
        attendanceIvan.put(LocalDate.parse("2020-10-23"), false);

        Map<LocalDate, Boolean> attendanceRoman = new HashMap<>();
        attendanceRoman.put(LocalDate.parse("2020-10-19"), true);
        attendanceRoman.put(LocalDate.parse("2020-10-20"), true);
        attendanceRoman.put(LocalDate.parse("2020-10-21"), true);
        attendanceRoman.put(LocalDate.parse("2020-10-22"), true);
        attendanceRoman.put(LocalDate.parse("2020-10-23"), false);

        Map<LocalDate, Boolean> attendanceOlga = new HashMap<>();
        attendanceOlga.put(LocalDate.parse("2020-10-19"), false);
        attendanceOlga.put(LocalDate.parse("2020-10-20"), true);
        attendanceOlga.put(LocalDate.parse("2020-10-21"), false);
        attendanceOlga.put(LocalDate.parse("2020-10-22"), false);
        attendanceOlga.put(LocalDate.parse("2020-10-23"), false);

        List<Student> students = Arrays.asList(
                new Student("Иван", attendanceIvan),
                new Student("Роман", attendanceRoman),
                new Student("Ольга", attendanceOlga));

        return students;
    }

}
