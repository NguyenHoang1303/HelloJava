package lab2.bai3.Ex1;

public class handleRectangle {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(3,7);
        rectangle1.display();
        rectangle1.setHeight(5);
        rectangle1.setWidth(15);
        int height = rectangle1.getHeight();
        int width = rectangle1.getWidth();
        System.out.println("dien tich la:" + rectangle1.getArea(height,width));
        System.out.println("chu vi la:" + rectangle1.getPerimeter(height,width));
    }
}
