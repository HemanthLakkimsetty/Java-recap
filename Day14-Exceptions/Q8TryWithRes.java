import java.util.Scanner;
public class Q8TryWithRes {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            String name=sc.nextLine();
            System.out.println("Hello "+name);
        }finally{
            System.out.println("Scanner class is closed by try with resource");
        }
    }
    
}
