package Instruction1;

public class Square extends Figure implements Printable {
    double a;

    Square(double a) {
        if(a>0)
            this.a = a;
        else {
            System.out.println("Error. Invalid value");
            this.a = -1;
        }
    }

    public double calculateArea() {
        return a * a;
    }

    public double calculatePerimeter() {
        return 4 * a;
    }

    public void print() {
        if (this.a > 0) {
            System.out.println("Square");
            System.out.println(String.format("Side: %.2f", a));
            System.out.println(String.format("Area: %.2f", calculateArea()));
            System.out.println(String.format("Perimeter: %.2f", calculatePerimeter()));
        }
    }

}
