import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Q10MaxMin {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>(Arrays.asList(1,1,1,2,2,3,3,4,5,5,5));

        System.out.println(Collections.min(al)+"\n"+Collections.max(al));
    }

}
