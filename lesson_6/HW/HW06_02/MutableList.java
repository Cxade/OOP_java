public class MutableList<T> extends AllList {
    private int size;
    private int position;

    @Override
    public int get(int i) {
        return position;
    }

    @Override
    public int getSize() {
        return size;
    }

    public void set(int i, T newValue) {

    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void add(T newValue) {
    }

    public void remove(T Value) {
    }

}

