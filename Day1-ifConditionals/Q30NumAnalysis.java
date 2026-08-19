import java.util.Scanner;

public class Q30NumAnalysis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>0){
            if(n%2==0){
                System.out.println("Positive \nEven");
            }else{
                System.out.println("Positive \nOdd");
            }
        }else if(n<0){
            if(n%2==0){
                System.out.println("Negative \nEven");
            }else{
                System.out.println("Negative \nOdd");
            }
        }else{
            System.out.println("Zero");
        }
    }
}
