import java.util.Scanner;

public class Q23CharsOfStr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        for(int i=0;i<str.length()-1;i++){
            System.out.println(str.charAt(i));
        }
        sc.close();
    }
}
