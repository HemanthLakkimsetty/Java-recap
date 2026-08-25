package ArrayPractice;

import java.util.Arrays;

public class Q22TwoArrEq {
    public static void main(String[] args) {
        int[] a1={10,20,30,40,50};
        int[] a2={10,20,30,40,50};
        if(Arrays.equals(a1, a2)){
            System.out.println("Equals both");
        }else{
            System.out.println("NOt Equal both");
        }
    }
}
