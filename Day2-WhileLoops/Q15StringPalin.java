import java.util.Scanner;

public class Q15StringPalin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine().toLowerCase().trim();
        int i=0;
        int j=str.length()-1;
        boolean isPali=true;
        while(i<=j){
            if(str.charAt(i)!=str.charAt(j)){
                isPali=false;
                break;
            }
            i++;
            j--;
        }
        if(isPali==true){
            System.out.println("palindrome");
        }else{
            System.out.println("not a Palindrome");
        }
        sc.close();
    }
}
