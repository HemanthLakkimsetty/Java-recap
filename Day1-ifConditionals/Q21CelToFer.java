import java.util.*;
public class Q21CelToFer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("opt1:To celsius");
        System.out.println("opt2:To Fahrenheit");
        int opt=sc.nextInt();
        if(opt==1){
            double n=sc.nextDouble();
            System.out.println((int)((n-31)/1.8)+"C");
        }else if(opt==2){
            int a=sc.nextInt();
            System.out.println((double)2*a+31+"F");
        }else{
            System.out.println("error wrong option");
        }
    }
}
