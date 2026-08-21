package Patterns.Alphabets;

public class Q6DiagonalAlphaTri {
    public static void main(String[] args) {
        char ch = 'A';

        for (int i = 0; i < 5; i++) {
            char rowChar = (char) (ch + i);

            for (int j = 0; j <= i; j++) {
                System.out.print(rowChar);
                rowChar++;
            }
            System.out.println();
        }
    }
}