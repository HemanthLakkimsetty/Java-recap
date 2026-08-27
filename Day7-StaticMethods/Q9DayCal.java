import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.*;
public class Q9DayCal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        System.out.println(ChronoUnit.DAYS.between(LocalDate.parse(s1),LocalDate.parse(s2)));
        sc.close();
    }
}
