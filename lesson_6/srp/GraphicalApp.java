package srp;

public class GraphicalApp {
    public static void main(String[] args) {
        // Rectangle rect = new Rectangle(6, 6);
        DrawRectangle drawRectangle = new DrawRectangle(new CalcRectangle(8, 8));
        drawRectangle.draw();
    }
}
