package LoopsControlStates;

public class Q1FirstPrime100 {
    public static void main(String[] args) {
        for(int i=100;;i++){
            if(isPrime(i)){
                System.out.println(i);
                break;
            }
        }
    }
    static boolean isPrime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
