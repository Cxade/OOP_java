import java.util.Iterator;

public class ReverseIterator implements Iterator<Student> {

    private StudentGroup studentGroup;
    private int index;

    public ReverseIterator(StudentGroup studentGroup, int index) {
        this.studentGroup = studentGroup;
        this.index = studentGroup.sizeOfGroup();
    }

    @Override
    public boolean hasNext() {
        return this.index > 0;
    }

    @Override
    public Student next() {
        this.index--;
        return studentGroup.getStudent(this.index);
    }

}
