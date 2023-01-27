package ocp;

public class SquareShapeAnotherColor extends SquareShape {
    private char color;

    

    public SquareShapeAnotherColor(char color) {
        this.color = color;
    }



    @Override
    public void draw() {
        System.out.printf("%c%c%c\n",color, color, color);
        System.out.printf("%c%c%c\n",color, color, color);
        System.out.printf("%c%c%c\n",color, color, color);
        System.out.println();
    }
    
    
}
