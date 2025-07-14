//1.Write a Java program to find Area and Perimeter of different shapes using polymorphism concept
import java.util.*;
class Shapes
{
  
  static double p=3.14;
  void area(double len,double breadth)
  {
    System.out.println("Area of Rectangle is "+len*breadth);
  }
  void area(int side)
  {
    System.out.println("Area of Square is "+side*side);
  }
  void area(double radius)
  {
    double a=p*radius*radius;
    System.out.println("Area of Circle is "+a);
  }
  void perimeter(double l,double b)
  {
    System.out.println("Perimeter of Rectangle is "+2*(l+b));
  }
  void perimeter(int side)
  {
    System.out.println("perimeter of Square is "+4*side);
  }
  void perimeter(double radius)
  {
    double a=p*radius*2;
    System.out.println("perimeter of Circle is "+a);
  }
  public static void main(String... args)
  {
    Scanner sc = new Scanner(System.in);
    double l,b;
    int side;
    double radius;
    Shapes s = new Shapes();
    System.out.println("Enter length and breadth of rectangle :");
    l=sc.nextDouble();
    b=sc.nextDouble();
    System.out.println("Enter side of Square :");
    side=sc.nextInt();
    System.out.println("Enter radius of circle :");
    radius=sc.nextDouble();
    s.area(l,b);
    s.perimeter(l,b);
    s.area(side);
    s.perimeter(side);
    s.area(radius);s.perimeter(radius);
  }
}



/*  interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

public class ShapeCalculator {
    public static void main(String[] args) {
        // Creating objects of different shapes
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);

        // Displaying area and perimeter of different shapes
        displayShapeInfo("Circle", circle);
        displayShapeInfo("Rectangle", rectangle);
    }

    // Method to display area and perimeter of a shape
    private static void displayShapeInfo(String shapeName, Shape shape) {
        System.out.println("Shape: " + shapeName);
        System.out.println("Area: " + shape.calculateArea());
        System.out.println("Perimeter: " + shape.calculatePerimeter());
        System.out.println();
    }
}
*/
