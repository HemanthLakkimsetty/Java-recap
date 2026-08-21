package LoopsControlStates;

import java.util.Scanner;

public class Q5MenuDisplay {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        while(true){
            System.out.println("1.Add 2.View 3.Exist");
            n=sc.nextInt();
            if(n==1){
                System.out.println("Add selected");
            }else if(n==2){
                System.out.println("View selected");
            }else if(n==3){
                System.out.println("Existed");
                break;
            }else{
                System.out.println("enter the correct opt");
            }
            sc.close();
            
        }
    }
}
