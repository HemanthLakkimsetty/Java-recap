import java.util.Scanner;

public class Q8DateVal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        try{
            java.time.LocalDate.parse(str);
            System.out.println("Valid Date");
        }catch(Exception e){
            System.out.println("Invalid Date");
        }
        sc.close();
    }
}
