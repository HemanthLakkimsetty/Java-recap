import java.util.*;
public class Q16ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String rev="";
        int j=str.length()-1;
        while(j>=0){
            rev=rev+str.charAt(j);
            j--;
        }
        System.out.println(rev);
        sc.close();
    }
}
