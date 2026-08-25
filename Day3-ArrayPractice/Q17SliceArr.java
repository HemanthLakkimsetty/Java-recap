package ArrayPractice;

import java.util.Arrays;
import java.util.Scanner;

public class Q17SliceArr {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,70};
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int e=sc.nextInt();
        int[] a1=Arrays.copyOfRange(arr,s,e);
        for(int i:a1){
            System.out.print(i+" ");
        }
        sc.close();
    }
}
