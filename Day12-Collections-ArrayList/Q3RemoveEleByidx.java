import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q3RemoveEleByidx {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int idx=sc.nextInt();
        int val=sc.nextInt();
        System.out.println("Remove by idx:");
        removeElementByIdx(idx);
        System.out.println("Remove element");
        removeElementByVal(Integer.valueOf(val));
        System.out.println("remove all occurance of val in list : ");
        removeAllElement(val);

        sc.close();
    }
    static void removeElementByIdx(int val){
        List<Integer> al = new ArrayList<>(Arrays.asList(1,2,2,3,5,8,9,3,4,6,3));
        System.out.println("Original list: " + al);
        al.remove(val);
        System.out.println("Current list: "+al);
    }

    static void removeElementByVal(int val){
        List<Integer> al = new ArrayList<>(Arrays.asList(1,2,2,3,5,8,9,3,4,6,3));
        System.out.println("Original list: " + al);
        al.remove(Integer.valueOf(val));
        System.out.println("Current list: "+al);
    }

    static void removeAllElement(int val){
        List<Integer> al = new ArrayList<>(Arrays.asList(1,2,2,3,5,8,9,3,4,6,3));
        System.out.println("Original list: " + al);
        al.removeAll(Collections.singleton(val));
        System.out.println("Current list: "+al);
    }
}
