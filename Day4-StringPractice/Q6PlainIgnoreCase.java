package StringPractice;

import java.util.Scanner;

public class Q6PlainIgnoreCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine().toLowerCase().replaceAll(" ","");
        int i=0;
        int j=str.length()-1;
        boolean palin=true;
        while(i<j){
            if(str.charAt(i)==str.charAt(j)){
                i++;
                j--;
            }else{
                palin=false;
                break;
            }
        }
        if(!palin){
            System.out.println("Not a Palindrome");
        }else{
            System.out.println("Palindrome");
        }
        sc.close();
    }
}
