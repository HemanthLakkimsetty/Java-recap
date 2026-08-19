import java.util.Scanner;

public class Q31VotingEligi {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int age=sc.nextInt();
        System.out.println("Are u Indian / Do u Posses indian citizenship");
        String citizen =sc.next();
        if(age>=18 && citizen.equalsIgnoreCase("Yes")){
            System.out.println("Eligible for vote");
        }else{
            System.out.println("Not Eligible for voting");
        }
    }
}
