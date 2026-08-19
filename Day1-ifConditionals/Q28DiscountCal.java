import java.util.Scanner;

public class Q28DiscountCal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double mrp=sc.nextDouble();
        double disco=sc.nextDouble();
        double disprice=(disco/100)*mrp;
        System.out.println((int)(mrp-disprice));
    }
}
