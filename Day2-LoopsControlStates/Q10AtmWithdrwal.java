package LoopsControlStates;

import java.util.Scanner;

public class Q10AtmWithdrwal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        while(true){
            if(n<=0){
                System.out.println("Invalid Amount");
                n=sc.nextInt();
            }else{
                System.out.println("withdrawal successful");
                break;
            }
        }
        sc.close();
    }
}
