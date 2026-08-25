package ArrayPractice;

import java.util.Scanner;

public class Q11InsertionArr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pos=sc.nextInt();
        int[] arr={10,20,40,50,60};
        int[] ar=new int[arr.length+1];
        for(int i=0;i<pos;i++){
            ar[i]=arr[i];
        }
        ar[pos]=n;
        int k=pos+1;
        for(int i=pos;i<arr.length;i++){
            ar[k]=arr[i];
            k++;
        }
        for(int i: ar){
            System.out.println(i);
        }
        sc.close();
    }
}
