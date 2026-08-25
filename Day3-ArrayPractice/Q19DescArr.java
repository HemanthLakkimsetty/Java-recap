package ArrayPractice;

import java.util.Arrays;

public class Q19DescArr {
    public static void main(String[] args) {
        int[] arr={45,12,67,8,34,23};
        Arrays.sort(arr);
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
