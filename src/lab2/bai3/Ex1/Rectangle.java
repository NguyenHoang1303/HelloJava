package lab2.bai3.Ex1;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(){};

    public Rectangle(int height, int width) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void display(){
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.printf("#");
            }
            System.out.println();
        }
    }

    public int getArea(int height, int width){
        return height * width;
    }

    public int getPerimeter(int height, int width){
        return (height + width) * 2;
    }

}
