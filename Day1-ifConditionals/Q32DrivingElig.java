import java.util.Scanner;

public class Q32DrivingElig {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        System.out.println("Do u have valid Driving License");
        String license=sc.next();
        if(age>=18 && license.equalsIgnoreCase("Yes")){
            System.out.println("Ur Eligible to Drive");
        }else{
            System.out.println("Not Eligible to Drive");
        }
    }
}
