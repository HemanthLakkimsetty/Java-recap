public class Q7PrintPrimeNum {

    public static void main(String[] args) {
        Q7PrintPrimeNum pp = new Q7PrintPrimeNum();
        pp.printPrimeNumbers(5);
    }

    void printPrimeNumbers(int n) {
        int count = 0;
        int num = 2;

        while (count < n) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }

    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}