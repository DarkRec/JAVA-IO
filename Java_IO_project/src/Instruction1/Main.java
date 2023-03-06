package Instruction1;
import java.util.Scanner;

public class Main {
	public static void menu(){
		System.out.println("================");
		System.out.println("Choose option: ");
		System.out.println("1. Select figure");
		System.out.println("2. Set values");
		System.out.println("3. Print");
		System.out.println("4. Exit\n");
	}
	public static int selectFigure(){
		Scanner scanner = new Scanner(System.in);
			int figure = 0;
			System.out.println("=======");
			System.out.println("Select figure: ");
			System.out.println("1. Circle");
			System.out.println("2. Square");
			System.out.println("3. Triangle");
			System.out.println("4. Equilateral Triangle");
			int f = scanner.nextInt();
			if (f == 1 || f == 2 || f == 3 || f == 4)
				figure = f;
			return figure;
	}

	public static Figure printFigure(int figure, double x, double h, double b, double c) {
		if (figure == 0)
			System.out.println("Error. First select figure");
		else if (x > 0) {
			System.out.println("================");
			if (figure == 1) {
				Circle circle = new Circle(x);
				circle.print();
				return circle;
			} else if (figure == 2) {
				Square square = new Square(x);
				square.print();
				return square;
			} else if (figure == 3) {
				Triangle triangle = new Triangle(x, h, b, c);
				triangle.print();
				return triangle;
			} else if (figure == 4) {
				Triangle triangle = new Triangle(x);
				triangle.print();
				return triangle;
			}
		} else
			System.out.println("Error. Wrong value");
		return null;
	}

	public static void buildPrism(Figure F){
		Scanner scanner = new Scanner(System.in);
		System.out.println("================");
			System.out.println("Make regular prism? ");
			System.out.println("(Press 1 - Yes / 2 - No)");
			if (scanner.nextInt() == 1) {
				System.out.println("Enter prism height");
				double H = scanner.nextDouble();
				Prism prism = new Prism(H, F);
				System.out.println("================");
				System.out.println("Prism");
				System.out.println("Area: "+prism.calculateArea());
				System.out.println("Volume: "+prism.calculateVolume());
			}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double x = 0,h = 0,b = 0,c = 0;
		int figure = 0;
			while (true) {
				menu();
				switch (scanner.nextInt()) {
					case 1:
						figure = selectFigure();
						break;
					case 2:
						if (figure == 0)
						System.out.println("Error. First select figure");
					else if (figure == 1) {
						System.out.println("Enter the radius of the circle: ");
						x = scanner.nextDouble();
					} else if (figure == 2) {
						System.out.println("Enter the side of the square");
						x = scanner.nextDouble();
					} else if (figure == 3) {
						System.out.println("Enter the side of the triangle");
						x = scanner.nextDouble();
						System.out.println("Enter the height of the triangle");
						h = scanner.nextDouble();
						System.out.println("Enter the second side of the triangle");
						b = scanner.nextDouble();
						System.out.println("Enter the third side of the triangle");
						c = scanner.nextDouble();
					} else if (figure == 4) {
						System.out.println("Enter the side of the triangle");
						x = scanner.nextDouble();
					}
						break;
					case 3:
						Figure F = printFigure(figure, x, h, b, c);
						if(F.calculateArea() > 0 && F.calculatePerimeter() > 0)
							buildPrism(F);
						break;
					case 4:
						System.exit(1);
						break;
				}

			}
	}
}
