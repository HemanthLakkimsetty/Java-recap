package StringPractice;

public class Q27ExtractNumStr {
    public static void main(String[] args) {
        String str = "Student25scored98in2025";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= '0' && ch <= '9') {
                System.out.print(ch);

                if (i + 1 == str.length() ||
                    str.charAt(i + 1) < '0' ||
                    str.charAt(i + 1) > '9') {
                    System.out.print(" ");
                }
            }
        }
    }
}