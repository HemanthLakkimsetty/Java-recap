package ArrayPractice;
import java.util.*;
public class Q6LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr={10,20,30,40,50};
        int idx=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                idx=i;
                break;
            }
        }
        System.out.println(idx);
        sc.close();
    }
}
