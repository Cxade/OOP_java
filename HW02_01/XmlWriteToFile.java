package HW02_01;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class XmlWriteToFile extends WriteToFile {
    private List<Student> students = new ArrayList<>();

    public XmlWriteToFile(List<Student> students) {
        this.students = students;
    }

    @Override
    public void writeFile() {
        try (FileWriter writer = new FileWriter("xml.txt", false)) {
            writer.append("<?xml version=\"1.0\" encoding=\"utf-8\" ?>\n"
                    + "<students>\n");
            for (Student student : students) {
                String text = String.format("<student>\n<name>%s/name>\n<grade>%.1f</grade>\n</student>",
                        student.getName(), student.getGrade());
                writer.append(text);
            }
            writer.append("\n</students>");
            writer.close();

        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

    }

}
