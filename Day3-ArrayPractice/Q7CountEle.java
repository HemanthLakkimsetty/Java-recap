package ArrayPractice;

import java.util.Scanner;

public class Q7CountEle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr={2,5,2,8,2,9,5,2};
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                cnt++;
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}
