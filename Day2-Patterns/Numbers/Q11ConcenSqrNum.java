package Patterns.Numbers;

public class Q11ConcenSqrNum {
    public static void main(String[] args) {

        int s = 2 * 4 - 1;

        for (int i = 0; i < s; i++) {

            for (int j = 0; j < s; j++) {

                int top = i;
                int left = j;
                int bottom = s - 1 - i;
                int right = s - 1 - j;

                int min = Math.min(
                    Math.min(top, bottom),
                    Math.min(left, right)
                );

                System.out.print(4 - min + " ");
            }

            System.out.println();
        }
    }
}