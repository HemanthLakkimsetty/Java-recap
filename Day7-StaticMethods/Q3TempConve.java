public class Q3TempConve {

    static double c2f(double c) {
        return (c * 9 / 5) + 32;
    }

    static double f2c(double f) {
        return (f - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        double c = 25;
        System.out.println(c2f(c));
    }
}