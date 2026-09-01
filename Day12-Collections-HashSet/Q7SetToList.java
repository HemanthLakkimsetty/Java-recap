import java.util.*;
public class Q7SetToList {
    public static void main(String[] args) {
        HashSet<Integer>hs=new HashSet<>(Arrays.asList(1,4,2,8,9));
        ArrayList<Integer>al=new ArrayList<>(hs);
        Collections.sort(al);
        System.out.println(al);
    }
}
