import java.util.Scanner;

public class Q2ReversePrintNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        while(i>=1){
            System.out.print(i+" ");
            i--;
        }
        sc.close();
    }
}
