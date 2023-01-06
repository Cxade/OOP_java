package HW02_01;

import java.util.*;

/*
Имеются данные о группе студентов. У каждого студента есть средний балл (например, 4.6).
Создайте родительский класс ЗаписывательВФайл. Создайте три детских класса, которые записывают
в файл информацию о студентах в разных формах:
 */


public abstract class WriteToFile {

    public abstract void writeFile(Student students);

}
