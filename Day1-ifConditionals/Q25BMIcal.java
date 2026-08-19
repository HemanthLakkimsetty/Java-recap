import java.util.Scanner;

public class Q25BMIcal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your weight in kg: ");
        double weight = sc.nextDouble();

        System.out.print("Enter your height in meters: ");
        double height = sc.nextDouble();

        double bmi = weight / (height * height);

        System.out.printf("Your BMI is: %.2f%n", bmi);

        if (age < 20) {
            System.out.println("For people under 20, BMI should be interpreted using age and sex-specific growth charts.");
        } else {
            if (bmi < 18.5) {
                System.out.println("Category: Underweight");
            } else if (bmi < 25) {
                System.out.println("Category: Normal weight");
            } else if (bmi < 30) {
                System.out.println("Category: Overweight");
            } else {
                System.out.println("Category: Obesity");
            }
        }

        sc.close();
    }
}