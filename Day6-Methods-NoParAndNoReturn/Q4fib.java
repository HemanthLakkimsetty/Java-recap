public class Q4fib {
    public static void main(String[] args) {
        Q4fib fib=new Q4fib();
        fib.printFibonacci(7);
    }

    void printFibonacci(int n){
        int a=0;
        int b=1;
        System.out.print(a+" "+b+" ");
        for(int i=1;i<=n-2;i++){
            int temp=a+b;
            a=b;
            b=temp;
            System.out.print(b+" ");
        }
    }
}
