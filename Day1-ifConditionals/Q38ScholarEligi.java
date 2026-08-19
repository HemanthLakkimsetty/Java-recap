import java.util.Scanner;

public class Q38ScholarEligi {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double gpa = sc.nextDouble();
        String activity = sc.next();

        if (gpa >= 8.5 && activity.equalsIgnoreCase("Yes")) {
            System.out.println("Eligible for Scholarship");
        } else {
            System.out.println("Not Eligible for Scholarship");
        }
    }
}
