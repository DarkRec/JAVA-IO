package Instruction1;

public class Circle extends Figure implements Printable {
    double r;

    Circle(double radius) {
        r = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    public void print() {
        System.out.println("Circle");
        System.out.println(String.format("Radius: %.2f", r));
        System.out.println(String.format("Area: %.2f", calculateArea()));
        System.out.println(String.format("Permieter: %.2f", calculatePerimeter()));
    }
}