import java.util.*;
public class Q6SortInASCAndDSC {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>(Arrays.asList(6,7,0,8,9,1,2,3,4,5));

        Collections.sort(al);
        System.out.println(al);
        Collections.sort(al,Collections.reverseOrder());
        System.out.println(al);

    }
}
