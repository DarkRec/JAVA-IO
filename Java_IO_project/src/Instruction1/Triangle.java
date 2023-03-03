package Instruction1;

public class Triangle extends Figure implements Printable {
    double a,b,c,h;

    Triangle(double side) {
        a = side;
        b = side;
        c = side;
        h = a*Math.sqrt(3)/2;
    }
    Triangle(double side, double height, double side2, double side3) {
        a = side;
        h = height;
        b = side2;
        if (b > h+a)
            b = h+a-1;
        c = side3;
        if (c > a+b)
            c = a+b-1;
    }

    @Override
    public double calculateArea() {
        return a * h / 2;
    }

    @Override
    public double calculatePerimeter() {
        return a+b+c;
    }

    @Override
    public void print() {
        System.out.println("Triangle");
        System.out.println(String.format("Sides: a:%.2f  b:%.2f  c:%.2f", a, b, c));
        System.out.println(String.format("Height: %.2f", h));
        System.out.println(String.format("Area: %.2f", calculateArea()));
        System.out.println(String.format("Perimeter: %.2f", calculatePerimeter()));
    }
}