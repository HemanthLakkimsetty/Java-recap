import java.util.Scanner;
public class Q5MultisOfNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        for(int i=1;n*i<=r;i++){
            System.out.println(n*i);
        }
        sc.close();
    }
}
