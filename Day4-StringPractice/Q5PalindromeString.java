package StringPractice;

import java.util.Scanner;

public class Q5PalindromeString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int i=0;
        int j=str.length()-1;
        boolean pali=true;
        while(i<=j){
            if(str.charAt(i)==str.charAt(j)){
                i++;
                j--;
            }else{
                pali=false;
                break;
            }
        }
        if(!pali){
            System.out.println("Not Palindrome");
        }else{
            System.out.println("Palindrome");
        }
        sc.close();
    }
}
