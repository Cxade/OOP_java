import java.util.*;

public class GroupListIterator implements ListIterator<Student> {
    private int index = -1;
    private StudentGroup studentGroup;

    public GroupListIterator(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    @Override
    public void add(Student e) {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean hasNext() {
        return this.index < this.studentGroup.sizeOfGroup() - 1;
    }

    @Override
    public boolean hasPrevious() {
        return this.index >= 0;
    }

    @Override
    public Student next() {
        this.index++;
        return studentGroup.getStudent(this.index);
    }

    @Override
    public int nextIndex() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public Student previous() {
        int i = this.index;
        this.index--;
        return studentGroup.getStudent(i);
    }

    @Override
    public int previousIndex() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void remove() {
        // TODO Auto-generated method stub

    }

    @Override
    public void set(Student e) {
        // TODO Auto-generated method stub

    }

}
