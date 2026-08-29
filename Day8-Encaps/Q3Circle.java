package Encaps;

import java.util.Scanner;

public class Q3Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Circle c = new Circle();

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        c.setRadius(r);

        System.out.println("Area: " + c.area());
        sc.close();
    }
}

class Circle {
    private double radius;

    public void setRadius(double radius) {
        if (radius < 0) {
            System.out.println("Error: Radius cannot be negative");
        } else {
            this.radius = radius;
        }
    }

    public double getRadius() {
        return radius;
    }

    public double area() {
        return 3.14 * radius * radius;
    }
}