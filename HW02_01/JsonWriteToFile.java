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
        // @Override
        // public void writeFile() {
        //     try (FileWriter writer = new FileWriter("json.txt", false)) {
        //         for (Student student : students) {
        //             String text = String.format("\"%s\": %f,\n", student.getName(), student.getGrade());
        //             writer.append(text);
        //         }
        
        //     } catch (IOException ex) {
        
        //         System.out.println(ex.getMessage());
        //     }
        
    
    }

}

// public static String removeLastChar(String s) {
//     return (s == null || s.length() == 0) ? null : (s.substring(0, s.length() - 1));
// }