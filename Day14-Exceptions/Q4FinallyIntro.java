import java.util.Scanner;

public class Q4FinallyIntro {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            int withdraw=sc.nextInt();
            System.out.println(withdraw);
        }catch(Exception e){
            System.out.println("Withdraw amount can be empty: "+e.getMessage());
        }finally{
            System.out.println("Scanner class is Closed");
            sc.close();
        }
    }
    
}
