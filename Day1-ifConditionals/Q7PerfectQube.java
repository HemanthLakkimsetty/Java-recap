import java.util.Scanner;

import javax.swing.plaf.synth.SynthSplitPaneUI;
public class Q7PerfectQube {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int q=(int)Math.round(Math.cbrt(n));
        if(q*q*q==n){
            System.out.println("its perfect cube");
        }else{
            System.out.println("its not a cubic number");
        }
    }
}