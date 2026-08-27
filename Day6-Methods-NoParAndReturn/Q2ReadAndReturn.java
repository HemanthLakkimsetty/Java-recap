package NoParAndReturn;

public class Q2ReadAndReturn {
    public static void main(String[] args) {
        Q2ReadAndReturn rr=new Q2ReadAndReturn();
        System.out.println(rr.readNum());
    }

    int readNum(){
        java.util.Scanner sc=new java.util.Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        return n;
    }
}
