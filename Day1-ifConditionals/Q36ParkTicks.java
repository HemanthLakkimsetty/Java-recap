import java.util.Scanner;
public class Q36ParkTicks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        int height = sc.nextInt();
        int price;

        if (age < 5) {
            price = 0;
        } else if (age <= 12) {
            if (height < 120) {
                price = 150;
            } else {
                price = 200;
            }
        } else {
            if (height < 120) {
                price = 250;
            } else {
                price = 350;
            }
        }

        System.out.println("Ticket Price:" + price);
    }
}