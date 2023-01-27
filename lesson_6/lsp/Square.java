package lsp;

public class Square implements Shape {
    private float side;

    public Square(float side) {
        this.side = side;
    }

    @Override
    public float getHeight() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public float getWidth() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void setHeight(float height) {
        this.side = height;
        
    }

    @Override
    public void setWidth(float width) {
        this.side = width;
        
    }

    @Override
    public float getArea() {
        return side * side;
    }




    


}
