package StringPractice;

import java.util.Scanner;

public class Q3PrintFirstAndLast {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(str.charAt(0)+" "+str.charAt(str.length()-1));
        sc.close();

    }
}
