package Task05_01.model.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import Task05_01.model.data.Student;

public class DataReader {
    private String path;

    public List<Student> readFromFile() {
        List<Student> students = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line;
            while ((line = br.readLine()) != null) {
                for (Student student : students) {
                    String[] str = line.split(",");
                    students.add(new Student(str[0], str[1], str[2], str[3], str[4]));
                }
            }
            br.close();
        } catch (Exception e) {
        }
        return students;

    }

}
