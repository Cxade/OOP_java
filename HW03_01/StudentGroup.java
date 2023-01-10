import java.util.*;

public class StudentGroup implements Iterable<Student> {
    private List<Student> studentList;

    public StudentGroup(List<Student> studentList) {
        this.studentList = studentList;
    }

    public int sizeOfGroup() {
        return this.studentList.size();
    }

    public Student getStudent(int index) {
        return this.studentList.get(index);
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }

    public Iterator<Student> revIterator() {
        return new ReverseIterator(this, 0);
    }

    public ListIterator<Student> listIterator() {
        return new GroupListIterator(this);
    }

}
