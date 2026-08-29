package AbstractionsPrac;

import java.util.Scanner;

public class Q7PaymentGateway {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double amt=sc.nextDouble();
        System.out.println("Pay through \n1.Credit card\n2. UPI");
        int opt=sc.nextInt();
        PaymentGateWay pg=(opt==1?new CreditCard():new UPI());
        pg.payment(amt);
        sc.close();
    }
}

interface PaymentGateWay{
    void payment(double amt);
}

class CreditCard implements PaymentGateWay{
    public void payment(double amt){
        System.out.println("Paid "+amt+"Using Credit Card");
    }
}

class UPI implements PaymentGateWay{
    public void payment(double amt){
        System.out.println("Paid "+amt+"Using UPI");
    }
}