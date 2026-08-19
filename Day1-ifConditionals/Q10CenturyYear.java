import java.util.Scanner;

public class Q10CenturyYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if(year%100==0){
            System.out.println("its a century year");
        }else{
            System.out.println("normal year");
        }
    }
    
}
