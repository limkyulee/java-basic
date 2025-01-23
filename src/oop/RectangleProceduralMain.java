package oop;

class Rectangle {
    int width;
    int height;

    int calculateArea() {
        return width * height;
    }

    int calculatePerimeter() {
        return width * 2 + height * 2;
    }

    boolean isSquare() {
        return width == height;
    }
}
public class RectangleProceduralMain {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.height = 5;
        r.width = 8;

        int area =  r.calculateArea();
        System.out.println(area);
        int perimeter = r.calculatePerimeter();
        System.out.println(perimeter);

        boolean isSquare = r.isSquare();
        System.out.println(isSquare);
    }

}
