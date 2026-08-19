import java.util.Scanner;

public class Q17AlphabetOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(Character.isLetter(ch)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
    
}
