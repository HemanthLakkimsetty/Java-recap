import java.util.*;
public class Q3UpdateAndRemove {
    public static void main(String[] args) {
        HashMap<Integer,Integer>hm=new HashMap<>(Map.of(1,100,2,200,3,300,4,400));

        hm.put(1,99);
        System.out.println(hm);
        hm.replace(2, 150);
        System.out.println(hm);
        hm.remove(4);
        System.out.println(hm);
    }
}
