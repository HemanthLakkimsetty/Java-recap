import java.util.Scanner;

public class Q8MultiOf4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%4==0){
            System.out.println("its multiple of 4");
        }else{
            System.out.println("not muliple");
        }
    }
    
}
