package Instruction1;

public class Prism {
    double h;
    Figure F;

    Prism(double height, Figure figure) {
        h = height;
        F = figure;
    }

    public double calculateArea() {
        return 2 * F.calculateArea() + F.calculatePerimeter() * h;
    }

    public double calculateVolume() {
        return F.calculateArea() * h;
    }
}
