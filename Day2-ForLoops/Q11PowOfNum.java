import java.util.Scanner;

public class Q11PowOfNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int pow=sc.nextInt();
        int val=1;
        for(int i=1;i<=pow;i++){
            val*=num;
        }
        System.out.println(val);
        sc.close();
    }
}
