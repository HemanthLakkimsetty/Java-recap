import java.util.Scanner;

public class Q13CircleClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double radius = sc.nextDouble();

        Circle c = new Circle(radius);

        System.out.println("Area: " + c.area());
        System.out.println("Circumference: " + c.circumference());

        sc.close();
    }
}

class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return 3.14 * radius * radius;
    }

    public double circumference() {
        return 2 * 3.14 * radius;
    }
}