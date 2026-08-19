import java.util.Scanner;

public class Q35CharClassi{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            if ("AEIOUaeiou".indexOf(ch) != -1) {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("Neither Vowel nor Consonant");
        }
    }
}