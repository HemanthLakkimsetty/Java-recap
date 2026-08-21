import java.util.Scanner;

public class Q13CountPrimeInRange  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r1=sc.nextInt();
        int r2=sc.nextInt();
        int cnt=0;
        for(int i=r1;i<=r2;i++){
            if(isPrime(i)){
                cnt+=1;
            }
        }
        System.out.println(cnt);
        sc.close();
    }
    static boolean isPrime(int n){
        if(n<=1) return false;
        if(n==2||n==3) return true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
