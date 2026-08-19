import java.util.Scanner;

public class Q29EvenOddGreater10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>10){
            if(n%2==0){
            System.out.println("Even \nGreater than 10");
            }else{
                System.out.println("Odd \nGreater than 10");
            }
        }else{
            System.out.println("Less than 10");
        }
    }
}
