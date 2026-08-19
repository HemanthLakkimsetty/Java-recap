import java.util.Scanner;

public class Q12VoteEligible {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("Eligible for voting");
        }else{
            System.out.println("not eligible for voting");
        }
    }
    
}
