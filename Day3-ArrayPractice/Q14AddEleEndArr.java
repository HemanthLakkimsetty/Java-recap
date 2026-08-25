package ArrayPractice;

import java.util.*;

public class Q14AddEleEndArr {
    public static void main(String[] args) {
        int[] arr={5,10,15,20};
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] newArr=Arrays.copyOf(arr,arr.length+1);

        newArr[newArr.length-1]=n;
        for(int i: newArr){
            System.out.print(i+" ");
        }
        sc.close();
    }
}
