import java.util.Scanner;

public class Q21SearchArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the search element");
        int se=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(se==arr[i]){
                System.out.print(i);
                break;
            }
            sc.close();
        }

    }
}
