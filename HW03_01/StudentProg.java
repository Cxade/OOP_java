import java.util.*;

public class StudentProg {

    public static void main(String[] args) {
        StudentGroup studentGroup = new StudentGroup(Arrays.asList(
                new Student("Иванов", 4.8f, "01.05.1985"),
                new Student("Петров", 4.5f, "03.02.1993"),
                new Student("Романов", 3.9f, "23.11.1989")));

        Iterator<Student> studentIt = studentGroup.iterator();

        while (studentIt.hasNext()) {
            System.out.println(studentIt.next());
        }

        System.out.println();

        // Здесь работает ReverseIterator
        Iterator<Student> studentRevIt = studentGroup.revIterator();

        while (studentRevIt.hasNext()) {
            System.out.println(studentRevIt.next());
        }

        System.out.println();

        // Здесь ListIterator
        ListIterator<Student> studentListIt = studentGroup.listIterator();

        while (studentListIt.hasNext()) {
            System.out.println(studentListIt.next());
        }

        // в обратном порядке
        System.out.println();

        while (studentListIt.hasPrevious()) {
            System.out.println(studentListIt.previous());
        }

    }

}
