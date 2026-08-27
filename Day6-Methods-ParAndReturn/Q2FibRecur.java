package ParAndReturn;

import java.util.Scanner;

public class Q2FibRecur {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Q2FibRecur fr = new Q2FibRecur();

        int n = sc.nextInt();

        System.out.println(fr.printFib(n));

        sc.close();
    }

    int printFib(int n) {
        if (n == 1) return 0;
        if (n == 2) return 1;

        return printFib(n - 1) + printFib(n - 2);
    }
}