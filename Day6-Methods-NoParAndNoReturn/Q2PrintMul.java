import java.util.Scanner;

public class Q2PrintMul {
    public static void main(String[] args) {
        Q2PrintMul mul=new Q2PrintMul();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        mul.printMsg(n);
        sc.close();
    }

    void printMsg(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n+"x"+i+"="+n*i);
        }
    }
}
