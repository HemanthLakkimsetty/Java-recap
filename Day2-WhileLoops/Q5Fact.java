import java.util.Scanner;

public class Q5Fact {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int fact=1;
        while(num!=0){
           fact*=num;
            num-=1;
        }
        System.out.println(fact);
        sc.close();
    }
}
