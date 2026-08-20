public class Q14Prime1To100 {
    public static void main(String[] args) {
        int i=2;
        while(i<=100){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
            i++;
        }
    }
    static boolean isPrime(int n){
        if(n==2||n==3) return true;
        int i=2;
        while(i<n){
            if(n%i==0){
                return false;
            }
            i++;
        }
        return true;
    }
}
