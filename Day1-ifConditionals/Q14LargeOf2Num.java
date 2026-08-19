import java.util.Scanner;

public class Q14LargeOf2Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>=b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
}
