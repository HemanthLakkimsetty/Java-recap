import java.util.*;
public class Q19PalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder(str);
        sb=sb.reverse();
        if(str.equalsIgnoreCase(sb.toString())){
            System.out.println("Palindrome");
        }else{
            System.out.println("not a palindrome");
        }
    }
}
