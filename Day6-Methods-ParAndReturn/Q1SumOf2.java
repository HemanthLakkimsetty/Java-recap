package ParAndReturn;

import java.util.Scanner;

public class Q1SumOf2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Q1SumOf2 obj = new Q1SumOf2();

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(obj.sum(a, b));

        sc.close();
    }

    int sum(int a, int b) {
        return a + b;
    }
}