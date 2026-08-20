import java.util.*;
public class Q9SumOfDigi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        while(n>0){
            int temp=n%10;
            sum+=temp;
            n/=10;
        }
        System.out.print(sum);
        sc.close();
    }
}
