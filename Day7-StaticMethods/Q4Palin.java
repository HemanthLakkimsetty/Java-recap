import java.util.Scanner;

public class Q4Palin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine().toLowerCase().replaceAll("[^a-z]","").trim();
        System.out.println(isPalindrome(str)?"Palindrome":"Not Palindrome");
        sc.close();
    }
    static boolean isPalindrome(String str){
        int i=0;
        int j=str.length()-1;
        while(i<=j){
            if(str.charAt(i)==str.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
}
