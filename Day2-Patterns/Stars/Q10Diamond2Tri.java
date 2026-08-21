package Patterns.Stars;

public class Q10Diamond2Tri {
    public static void main(String[] args) {
        int n = 5;

        // Upper half + middle
        for (int i = 1; i <= n; i += 2) {

            for (int j = 1; j <= (n - i) / 2; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            for (int j = 1; j <= (n - i) / 2; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }

        // Lower half
        for (int i = n - 2; i >= 1; i -= 2) {

            for (int j = 1; j <= (n - i) / 2; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            for (int j = 1; j <= (n - i) / 2; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
