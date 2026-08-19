import java.util.Scanner;
public class Q4DiviBy2and3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==0&&n%3==0){
            System.out.println("its divisible by 2 and 3");
        }else{
            System.out.println("its not divisible");
        }
    }
}
