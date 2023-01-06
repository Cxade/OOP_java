package HW02_01;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Иван Иванов", 4.8f));
        students.add(new Student("Мария Кузнецова", 5.0f));
        students.add(new Student("Степан Кузьмин", 3.6f));

        // System.out.println(students);

        // TXT
        // for (Student student : students) {
        // System.out.println(student.getName() + "=" + student.getGrade());
        // }

        // JSON
        // for (Student student : students) {
        // System.out.println("\"" + student.getName() + "\"" + ": " +
        // student.getGrade() + ",");
        // }

        // XML
        // System.out.println("<?xml version=\"1.0\" encoding=\"utf-8\" ?>");
        // System.out.println("<students>");
        // for (Student student : students) {
        //     System.out.println("<student>\n<name>" + student.getName() + "</name>\n<grade>" + student.getGrade()
        //             + "</grade>\n</student>");
        // }
        // System.out.println("</students>");

    }
}
