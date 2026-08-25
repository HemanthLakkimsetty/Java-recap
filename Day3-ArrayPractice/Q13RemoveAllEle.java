package ArrayPractice;

import java.util.Scanner;

public class Q13RemoveAllEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = {10, 20, 40, 50, 60};

        int k = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != n) {
                arr[k] = arr[i];
                k++;
            }
        }

        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}