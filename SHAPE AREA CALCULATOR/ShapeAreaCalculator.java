import java.util.Scanner;

class InputScanner {
    protected Scanner scanner;

    public InputScanner() {
        scanner = new Scanner(System.in);
    }

    public int getInput(String message) {
        System.out.print(message);
        return scanner.nextInt();
    }
}


abstract class Shape extends InputScanner {
    protected int dimension1; 
    protected int dimension2; 

    public abstract void printArea();
}


class Rectangle extends Shape {
    public Rectangle() {
        this.dimension1 = getInput("Enter length of the rectangle: ");
        this.dimension2 = getInput("Enter width of the rectangle: ");
    }

    
    public void printArea() {
        int area = dimension1 * dimension2;
        System.out.println("Area of Rectangle: " + area);
    }
}


class Triangle extends Shape {
    public Triangle() {
        this.dimension1 = getInput("Enter base of the triangle: ");
        this.dimension2 = getInput("Enter height of the triangle: ");
    }

    public void printArea() {
        double area = 0.5 * dimension1 * dimension2;
        System.out.println("Area of Triangle: " + area);
    }
}


class Circle extends Shape {
    public Circle() {
        this.dimension1 = getInput("Enter radius of the circle: ");
    }

    public void printArea() {
        double area = Math.PI * dimension1 * dimension1;
        System.out.println("Area of Circle: " + area);
    }
}


public class ShapeAreaCalculator {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        rectangle.printArea();

        Shape triangle = new Triangle();
        triangle.printArea();

        Shape circle = new Circle();
        circle.printArea();
    }
}
