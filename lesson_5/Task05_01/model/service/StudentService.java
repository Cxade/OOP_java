package Task05_01.model.service;

import java.util.*;

import Task05_01.model.data.Student;
import Task05_01.model.util.DataWriter;

public class StudentService implements DataService<Student> {
    private List<Student> students;

    

    public StudentService(List<Student> students) {
        this.students = students;
    }

    @Override
    public void addStudent(Student student) {
        students.add(student);
        
    }

    @Override
    public void saveToFile(String path) {
        DataWriter.writeToFile(students);
        
    }

    public List<Student> getStudents() {
        List<Student> copyStudent = new ArrayList<>();
        for (Student student : students) {
            copyStudent.add(student);            
        }
        return copyStudent;
    }
    
}




// package Task05_01.model.service;

// import java.util.*;

// import Task05_01.model.data.Student;
// import Task05_01.model.util.DataWriter;

// public class StudentService implements DataService<Student> {
//     private List<Student> students = new ArrayList<>();

//     @Override
//     public void addStudent(Student student) {
//         students.add(student);
        
//     }

//     @Override
//     public void saveToFile(String path) {
//         DataWriter.writeToFile(students);
        
//     }
    
// }
 