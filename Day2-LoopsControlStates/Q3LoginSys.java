package LoopsControlStates;

import java.util.Scanner;

public class Q3LoginSys {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cnt=3;
        String password=sc.next();
        while(cnt!=0){
            if("pass123".equals(password)){
                System.out.println("Login Successful");
                break;
            }else{
            password=sc.next();
            System.out.println("Wrong Password");
            cnt--;
            }
        }
        sc.close();
    }
}
