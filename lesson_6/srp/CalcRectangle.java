package srp;

class CalcRectangle {
    private int width, height;
   

    public CalcRectangle(int width, int height) {
        this.width = width;
        this.height = height;

    }
    

    // вычислительная задача (надо бы вывести в отдельный класс)
    public int getArea () { return width * height; }


    public int getWidth() {
        return width;
    }


    public int getHeight() {
        return height;
    }

}
