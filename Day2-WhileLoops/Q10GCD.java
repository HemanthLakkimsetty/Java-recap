import java.util.Scanner;

public class Q10GCD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int a1=0;
        int a2=0;
        if(a>b){
            a1=a;
            a2=b;
        }else{
            a1=b;
            a2=a;
        }
        while(a2!=0){
            int rem=a1%a2;
            a1=a2;
            a2=rem;
        }
        System.out.println(a1);
        sc.close();
    }
}
