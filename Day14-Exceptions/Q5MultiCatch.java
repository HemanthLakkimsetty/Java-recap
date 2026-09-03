import java.util.InputMismatchException;
import java.util.Scanner;

public class Q5MultiCatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            int k=Integer.parseInt(sc.next());
            int a=10/k;
        }catch(ArithmeticException e){
            System.out.println("Bro! Exeception encountered :"+e.getMessage());
        }catch(InputMismatchException e){
            System.out.println("Bro! Input is not Integer: "+e.getMessage());
        }catch(RuntimeException e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Scanner class is closed!");
            sc.close();
        }
    }
    
}
