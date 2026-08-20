import java.util.Scanner;

public class Q11powerOfNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int val=1;
        int pow=sc.nextInt();
        while(pow>0){
            val*=n;
            pow--;
        }
        System.out.println(val);
        sc.close();
    }
}
