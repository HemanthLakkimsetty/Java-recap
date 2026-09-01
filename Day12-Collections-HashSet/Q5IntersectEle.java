import java.util.Arrays;
import java.util.HashSet;

public class Q5IntersectEle {
    public static void main(String[] args) {
        HashSet<Integer>hs1=new HashSet<>(Arrays.asList(1,2,3,4));
        HashSet<Integer>hs2=new HashSet<>(Arrays.asList(1,2));

        hs1.retainAll(hs2);
        System.out.println(hs1);

    }
}
