package ParAndReturn;

import java.util.Scanner;

public class Q4FindMaximum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        Q4FindMaximum ma = new Q4FindMaximum();

        System.out.println(ma.findMaximum(numbers));

        sc.close();
    }

    int findMaximum(int... numbers) {
        int max = numbers[0];

        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }
}