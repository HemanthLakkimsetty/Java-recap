import java.util.Scanner;

public class Q12RectangleClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double length = sc.nextDouble();
        double breadth = sc.nextDouble();

        Rectangle r = new Rectangle(length, breadth);

        System.out.println("Area: " + r.area());
        System.out.println("Perimeter: " + r.perimeter());

        sc.close();
    }
}

class Rectangle {
    double length;
    double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double area() {
        return length * breadth;
    }

    public double perimeter() {
        return 2 * (length + breadth);
    }
}