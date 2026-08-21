package LoopsControlStates;
import java.util.Scanner;
public class Q4CalAvgUntilNeg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        while(true){
            if(n>0){
                sum+=n;
                n=sc.nextInt();
            }else{
                break;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
