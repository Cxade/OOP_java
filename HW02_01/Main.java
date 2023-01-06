package HW02_01;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Иван Иванов", 4.8f));
        students.add(new Student("Мария Кузнецова", 5.0f));
        students.add(new Student("Степан Кузьмин", 3.6f));

        TxtWriteToFile txt = new TxtWriteToFile(students);
        txt.writeFile();

        JsonWriteToFile json = new JsonWriteToFile(students);
        json.writeFile();
        
        XmlWriteToFile xml = new XmlWriteToFile(students);
        xml.writeFile();
    }
}
