package Task05_01.view;

import java.util.*;

import Task05_01.model.data.Student;
import Task05_01.model.service.StudentService;

public class StudentView {
    public void printStudents(StudentService students) {
        for (Student student : students.getStudents()) {
            System.out.println(student);
        }
    }
}
