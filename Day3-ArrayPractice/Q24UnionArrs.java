package ArrayPractice;

import java.util.HashSet;

public class Q24UnionArrs {
    public static void main(String[] args) {
        int[] a1={1,2,3,4,5};
        int[] a2={4,5,6,7};
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<a1.length && i<a2.length;i++){
            hs.add(a1[i]);
            hs.add(a2[i]);
        }
        for(int i:hs){
            System.out.print(i+" ");
        }
    }
}
