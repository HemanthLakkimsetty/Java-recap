import java.util.Scanner;
import java.util.function.Predicate;

public class Q3PredicateIntro {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        Predicate<Integer> isEven=(x)->x%2==0;
        Predicate<Integer> isOdd=(x)->x%2!=0;
        System.out.println("Even: "+isEven.test(num));
        System.out.println("Odd: "+isOdd.test(num));
        sc.close();

        //Predicate acts as boolean variable but it store the entire condition in an variable instead of creating a boolean method

        /*Predicate in-build methods:
        1.predicate.test()
        2.predicate1.and(predicate2)
        3.predicate1.or(predicate2)
        4.predicate1.negate(predicate2)
        5.predicate1.equals(predicate2) */
    }
}
