package HW02_01;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class TxtWriteToFile extends WriteToFile {

    private List<Student> students = new ArrayList<>();

    public TxtWriteToFile(List<Student> students) {
        this.students = students;
    }

    @Override
    public void writeFile() {
        try (FileWriter writer = new FileWriter("txt.txt", false)) {
            for (Student student : students) {
                String text = String.format("%s=%.1f\n", student.getName(), student.getGrade());
                writer.append(text);
            }
            writer.close();

        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
