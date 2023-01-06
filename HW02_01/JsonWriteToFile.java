package HW02_01;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class JsonWriteToFile extends WriteToFile {

    private List<Student> students = new ArrayList<>();

    public JsonWriteToFile(List<Student> students) {
        this.students = students;
    }

    @Override
    public void writeFile() {
        try (FileWriter writer = new FileWriter("json.txt", false)) {
            writer.append("{\n");
            for (Student student : students) {
                String text = String.format("\"%s\": %.1f,\n", student.getName(), student.getGrade());
                writer.append(text);
            }
            writer.append("}");
            writer.close();
    
        } catch (IOException ex) {
    
            System.out.println(ex.getMessage());
        }
    
    }

}