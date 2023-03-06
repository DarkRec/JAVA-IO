package Instruction1;

public class Triangle extends Figure implements Printable {
    double a,b,c,h;

    Triangle(double a) {
        if(a>0) {
            this.a = a;
            this.b = a;
            this.c = a;
            this.h = a * Math.sqrt(3) / 2;
        }
        else {
            System.out.println("Error. Invalid value");
            this.a = this.b = this.c = this.h = -1;
        }
    }
    Triangle(double a, double h, double b, double c) {
        if (a>0 && b>0 && c>0 && h>0) {
            this.a = a;
            this.h = h;
            this.b = b;
            if (this.b > this.h + this.a) {
                System.out.println("Error. The value does not fulfill the triangle condition");
                this.b = this.h + this.a - 1;
                System.out.println("Value of second side set to " + this.b);
                System.out.println("----------------");
            }
            this.c = c;
            if (this.c > this.a + this.b) {
                System.out.println("Error. The value does not fulfill the triangle condition");
                this.c = this.a + this.b - 1;
                System.out.println("Value of third side set to " + this.c);
                System.out.println("----------------");
            }
        }
        else {
            System.out.println("Error. Invalid value");
            this.a = this.b = this.c = this.h = -1;
        }
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
        if (this.a > 0 && this.b > 0 && this.c > 0 && this.h > 0) {
            System.out.println("Triangle");
            System.out.println(String.format("Sides: a:%.2f  b:%.2f  c:%.2f", a, b, c));
            System.out.println(String.format("Height: %.2f", h));
            System.out.println(String.format("Area: %.2f", calculateArea()));
            System.out.println(String.format("Perimeter: %.2f", calculatePerimeter()));
        }
    }
}