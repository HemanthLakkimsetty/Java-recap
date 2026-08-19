import java.util.Scanner;
public class Q37MembDisc {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double amount = sc.nextDouble();
        char member = sc.next().charAt(0);

        double discount;

        if (member == 'Y' || member == 'y') {
            if (amount >= 5000) {
                discount = 20;
            } else if (amount >= 2000) {
                discount = 10;
            } else {
                discount = 5;
            }
        } else {
            if (amount >= 5000) {
                discount = 10;
            } else {
                discount = 0;
            }
        }

        double finalAmount = amount - (amount * discount / 100);

        System.out.println("Final Purchase Amount:" + finalAmount);
    }
    
}

