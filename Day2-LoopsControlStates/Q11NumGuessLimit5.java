package LoopsControlStates;

import java.util.Scanner;

public class Q11NumGuessLimit5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int cnt=5;
        while(true){
            if(n!=42 && cnt>1){
                System.out.println("Wrong Guess Again");
                n=sc.nextInt();
                cnt--;
            }else if(n==42){
                System.out.println("correct");
                break;
            }else{
                System.out.println("Run out of Chamces");
                break;
            }
        }
        sc.close();
    }
}
