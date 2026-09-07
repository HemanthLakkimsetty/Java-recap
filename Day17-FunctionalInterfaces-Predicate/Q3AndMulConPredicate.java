import java.util.*;
import java.util.function.*;

public class Q5AndMulConPredicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        Predicate<Integer> numGre50=(x)->x>50;
        Predicate<Integer> divBy5=(x)->x%5==0;
        Predicate<Integer> numBet10And100=(x)->x>10&&x<100;

        System.out.println(numGre50.and(divBy5.and(numBet10And100)).test(num));

        sc.close();
    }
}
