public class ImmutableList<T> extends AllList {
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

}
