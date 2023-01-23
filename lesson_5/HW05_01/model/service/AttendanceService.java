package model.service;

import java.util.*;

import model.data.Student;
import model.data.StudentPercent;

public class AttendanceService {

    public List<StudentPercent> allAttendance(List<Student> students) {
        List<StudentPercent> attendance = new ArrayList<StudentPercent>();

        for (Student student : students) {
            List<Boolean> valueList = new ArrayList<>(student.getAttendance().values());
            int count = 0;
            for (int i = 0; i < valueList.size(); i++) {
                if (valueList.get(i)) {
                    count++;
                }
            }

            float formatStr = (float) count / valueList.size() * 100;
            attendance.add(new StudentPercent(student.getName(), formatStr));
        }
        return attendance;
    }

    public List<StudentPercent> sortAttendance(List<Student> students) {
        List<StudentPercent> studentPercents = allAttendance(students);
        List<StudentPercent> copy = new ArrayList<>();
        copy.addAll(studentPercents);

        Comparator<StudentPercent> comparator = Comparator.comparing(obj -> obj.getPercent());
        Collections.sort(copy, comparator);
        Collections.reverse(copy);

        return copy;

    }

    public List<StudentPercent> minAttendance(List<Student> students) {
        List<StudentPercent> studentPercents = allAttendance(students);
        List<StudentPercent> minPercent = new ArrayList<>();

        for (StudentPercent studentPercent : studentPercents) {
            if (studentPercent.getPercent() < 25.00) {
                minPercent.add(studentPercent);
            }
        }

        return minPercent;
    }

}
