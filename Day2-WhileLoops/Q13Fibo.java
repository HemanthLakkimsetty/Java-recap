import java.util.Scanner;

public class Q13Fibo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        System.out.print(a+" "+b+" ");
        int i=2;
        while(i!=n){
            int temp=a+b;
            a=b;
            b=temp;
            System.out.print(b+" ");
            i++;
        }
        sc.close();
    }
}
