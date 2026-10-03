
abstract class Shape {
    abstract void calculateArea();
}

class Circle extends Shape {
    double radius = 5;

    void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Circle Area: " + area);
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.calculateArea();
    }
}