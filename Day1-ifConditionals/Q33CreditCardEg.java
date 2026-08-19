import java.util.Scanner;

public class Q33CreditCardEg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        System.out.println("Annual income: ");
        double income=sc.nextDouble();
        if(age>=21 && income>=300000){
            System.out.println("Eligible for Credit Card");
        }else{
            System.out.println("not Eligible for Credit Card");
        }
    }
}
