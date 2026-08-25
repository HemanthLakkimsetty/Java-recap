import java.util.Scanner;

public class Q8BuildCsvLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(sc.nextLine());

            if (i < n - 1) {
                sb.append(",");
            }
        }

        System.out.println(sb);
        sc.close();
    }
}
