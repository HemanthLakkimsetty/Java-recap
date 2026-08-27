public class Q1Calculator {

    static int add(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static int mul(int a, int b) {
        return a * b;
    }

    static int div(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println(
            add(1, 2) + "\n" +
            sub(6, 4) + "\n" +
            mul(2, 2) + "\n" +
            div(4, 1)
        );
    }
}