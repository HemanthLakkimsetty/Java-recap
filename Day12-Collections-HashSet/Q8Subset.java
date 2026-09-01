import java.util.Arrays;
import java.util.HashSet;

public class Q8Subset {
    public static void main(String[] args) {
        HashSet<Integer>hs1=new HashSet<>(Arrays.asList(1,2,3,4));
        HashSet<Integer>hs2=new HashSet<>(Arrays.asList(2,3,4));

        hs1.containsAll(hs2);
        System.out.println(hs1.containsAll(hs2));
    }
}
