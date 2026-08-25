import java.util.Scanner;

public class Q11CalculatorClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        Calculator cal = new Calculator();

        System.out.println("Addition: " + cal.addition(a, b));
        System.out.println("Subtraction: " + cal.subtraction(a, b));
        System.out.println("Multiplication: " + cal.multiplication(a, b));
        System.out.println("Division: " + cal.division(a, b));

        sc.close();
    }
}

class Calculator {

    public double addition(double a, double b) {
        return a + b;
    }

    public double subtraction(double a, double b) {
        return a - b;
    }

    public double multiplication(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) {
        return a / b;
    }
}