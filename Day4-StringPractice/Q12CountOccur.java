package StringPractice;

public class Q12CountOccur {
    public static void main(String[] args) {
        String str="Mississippi";
        char ch='s';
        int length=(str.length()-str.replaceAll(String.valueOf(ch),"").length());
        System.out.println(length);
    }
}
