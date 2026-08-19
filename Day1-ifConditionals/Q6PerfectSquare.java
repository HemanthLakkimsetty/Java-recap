import java.util.Scanner;
public class Q6PerfectSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int q=(int)Math.sqrt(n);
        if(q*q==n){
            System.out.println("perfect square");
        }else{
            System.out.println("not perfect");
        }
    }
}
