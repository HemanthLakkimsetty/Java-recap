package ArrayPractice;
import java.util.Scanner;;
public class Q12RemoveEle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={10,20,30,40,30,50};
        int n= sc.nextInt();
        int idx=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                idx=i;
                break;
            }
        }

        for(int i=idx+1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        for(int i:arr){
            System.out.println(i);
        }
        sc.close();
    }
}
