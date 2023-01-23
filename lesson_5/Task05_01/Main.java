package Task05_01;

import java.util.*;

import Task05_01.model.data.Student;
import Task05_01.model.service.StudentService;
import Task05_01.model.util.DataWriter;
import Task05_01.view.StudentView;

public class Main {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Dima", "Petrov", "MSU", "IT", "1"),
            new Student("Victor", "Sidorov", "MSU", "IT", "1"),
            new Student("Vlad", "Ivanov", "MSU", "IT", "1"),
            new Student("Egor", "Petrov", "MSU", "IT", "1")
        );
        
        new DataWriter().writeToFile(students);
        // StudentService studentService = new StudentService(students);
        new StudentView().printStudents(new StudentService(students));
    }
}
