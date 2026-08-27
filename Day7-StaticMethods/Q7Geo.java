import java.util.*;

class Q7Geo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n = sc.nextDouble();     // circle radius
        double num = sc.nextDouble();  // rectangle length
        double rect = sc.nextDouble(); // rectangle width
        double cir = sc.nextDouble();  // triangle base
        double tri = sc.nextDouble();  // triangle height

        System.out.println("Circle Area: " + cir(n));
        System.out.println("Rectangle Area: " + rect(num, rect));
        System.out.println("Triangle Area: " + tri(cir, tri));
        sc.close();
    }

    static double cir(double n) {
        return 3.14 * n * n;
    }

    static double rect(double n, double num) {
        return n * num;
    }

    static double tri(double n, double num) {
        return 0.5 * n * num;
    }
}