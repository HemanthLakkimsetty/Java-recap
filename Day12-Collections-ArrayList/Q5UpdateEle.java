import java.util.ArrayList;
import java.util.Arrays;

public class Q5UpdateEle {
    public static void main(String[] args) {
        int idx=2;
        int val=90;
        ArrayList<Integer> al=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,0));
        System.out.println(al);
        al.set(idx,val);
        System.out.println(al);
    }
}
