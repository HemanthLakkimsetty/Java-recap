import java.util.Arrays;
import java.util.HashSet;

public class Q3RemoveEle {
    public static void main(String[] args) {
        HashSet<Integer>hs=new HashSet<>(Arrays.asList(1,2,3,4));
        int val=4;
        hs.remove(val);
        System.out.println(hs);
    }
}
