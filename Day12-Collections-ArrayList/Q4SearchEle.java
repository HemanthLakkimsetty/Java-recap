import java.util.*;
public class Q4SearchEle{
    public static void main(String[] args) {
        int search=1;
        ArrayList<Integer> al=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,0));
        if(al.contains(search)){
            System.out.print(al.indexOf(search));
        }
    }
}