import java.util.Scanner;

public class Q15LcmOf2 {
    //we can go with gcd method with eucliden method
    //but her we use infinite for loop to find lcm of 2 numbers
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=Math.max(a,b);;i++){
            if(i%a==0 && i%b==0){
                System.out.println(i);
                break;
            }
        }
        sc.close();
    }
}
