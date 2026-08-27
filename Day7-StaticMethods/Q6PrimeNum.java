import java.util.Scanner;

public class Q6PrimeNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int n = sc.nextInt();

        if (isPrime(number))
            System.out.println("Prime");
        else
            System.out.println("Not Prime");

        System.out.println(getNthPrime(n));
        sc.close();
    }
    
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        if(n==2||n==3){
            return true;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    static int getNthPrime(int n){
        int num=1;
        int cnt=0;
        while(cnt<n){
            num++;
            if(isPrime(num)){
                cnt++;
            }
        }
        return num;
    }
}
//2,3,5,7,11