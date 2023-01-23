package controller;

import java.util.*;

import model.data.Student;
import model.service.AttendanceService;
import model.service.StudentService;
import view.AttendanceView;

/**
 Напишите программу, позволяющую анализировать посещаемость студентов. Используйте паттерн MVP.

Есть группа студентов. Для каждого студента есть журнал его посещаемости: список дат занятий и для каждой даты — посетил студент занятие или нет.
Создайте класс AttendanceService (сервис посещаемости), в котором хранится информация обо всех студентах.

Создайте класс AttendanceView, который позволяет отображать студентов и их посещаемость.

Создайте класс presenter со следующими функциями:
• Распечатать всех студентов и посещаемость каждого в процентах
• Распечатать студентов, отсортировав их по убыванию посещаемости (вверху самые посещающие)
• Распечатать студентов с посещаемостью ниже 25%

Проверьте, как это работает.
 */

public class Presenter {

    public static void main(String[] args) {
        AttendanceService attend = new AttendanceService();
        AttendanceView print = new AttendanceView();
        List<Student> students = new StudentService().makeStudents();

        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "Введите число от 1 до 3, где:\n" +
                "1 - показать всех студентов \n" +
                "2 - отсортировать студентов по посещаемости\n" +
                "3 - показать студентов с посещаемостью меньше 25%");
        switch (scanner.nextInt()) {
            case 1:
                print.printStudents(attend.allAttendance(students));
                break;
            case 2:
                print.printStudents(attend.sortAttendance(students));
                break;
            case 3:
                print.printStudents(attend.minAttendance(students));
                break;

            default:
                System.out.println("Введите корректное число!");
                break;
        }
        scanner.close();

    }
}
