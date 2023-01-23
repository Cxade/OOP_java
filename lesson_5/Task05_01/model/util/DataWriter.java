package Task05_01.model.util;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.*;
import java.util.*;

import Task05_01.model.data.Student;

/*
Создайте три класса в пакете data: User, Teacher, Student. User содержит поля, общие для студента и преподавателя. Student и Teacher добавляют поля, специфичные для этих классов.
Из соображений времени не делайте класс Teacher и связанные с ним классы.
Создайте два класса в пакете util: DataWriter и DataReader. Они позволяют сохранить в файл коллекцию студентов и преподавателей, а также загрузить их из файлов.
Создайте в пакете service: интерфейс DataService и два детских класса: StudentService и TeacherService. Сервис скрывает в себе коллекцию объектов. Интерфейс содержит операции:
добавить нового студента или учителя
сохранить всех в файл
загрузить всех из файла

 */

public class DataWriter {

    public static void writeToFile(Iterable<Student> students) {
  
        try(FileWriter myWriteCreate = new FileWriter("students.txt")) {
            // FileWriter myWriteCreate = new FileWriter("students.txt");
            for (Student student : students) {
                myWriteCreate.write(student.toString() + "\n");
            }
            // myWriteCreate.close();
        } catch (IOException e) {
        }

    }

}
