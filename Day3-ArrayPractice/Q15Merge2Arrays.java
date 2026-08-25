package ArrayPractice;

import java.util.Arrays;

public class Q15Merge2Arrays {
    public static void main(String[] args) {
        int[] a1={10,20,30};
        int[] a2={40,50,60,70};
        int[] arr=Arrays.copyOf(a1,a1.length+a2.length);
        int idx=0;
        for(int i=a1.length;i<arr.length;i++){
            arr[i]=a2[idx++];
        }

        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    
}
