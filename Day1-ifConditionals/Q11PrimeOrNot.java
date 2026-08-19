import java.util.Scanner;

public class Q11PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isPrime(n)){
            System.out.println("Prime");
        }else{
            System.out.println("not a prime");
        }
    }
    static boolean isPrime(int num){
        if(num<=1) return false;
        if(num==2||num==3) return true;
        for(int i=2;i<Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
