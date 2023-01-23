package view;

import java.util.*;
import model.data.StudentPercent;

public class AttendanceView {

    public void printStudents(List<StudentPercent> studentPercents) {
        for (StudentPercent studentPercent : studentPercents) {
            System.out.println(
                    String.format(Locale.ROOT, "%s %.2f %%", studentPercent.getName(), studentPercent.getPercent()));
        }
        System.out.println();
    }

}
