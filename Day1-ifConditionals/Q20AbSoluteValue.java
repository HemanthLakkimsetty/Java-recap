import java.util.Scanner;
public class Q20AbSoluteValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<0){
            System.out.println(-1*n);
        }else{
            System.out.println(n);
        }
    }
}
