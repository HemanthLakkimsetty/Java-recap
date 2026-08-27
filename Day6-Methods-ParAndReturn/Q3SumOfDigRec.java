package ParAndReturn;

import java.util.Scanner;

public class Q3SumOfDigRec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Q3SumOfDigRec sd=new Q3SumOfDigRec();
        System.out.println(sd.sumOfDigit(n));
        sc.close();
    }

    int sumOfDigit(int n){
        if(n==0){
            return n;
        }
        return n%10+sumOfDigit(n/10);
    }
}
