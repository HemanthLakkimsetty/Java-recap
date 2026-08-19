import java.util.Scanner;

public class Q22SimpleCal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two operands");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter the operator");
        char ch=sc.next().charAt(0);
        if(ch=='+'){
            System.out.println(a+b);
        }else if(ch=='-'){
            System.out.println(a-b);
        }else if(ch=='*'){
            System.out.println(a*b);
        }else if(ch=='/' && a>=b && b!=0){
            System.out.println(a/b);
        }else{
            System.out.println("Error enter the correct values");
        }
    }
    
}
