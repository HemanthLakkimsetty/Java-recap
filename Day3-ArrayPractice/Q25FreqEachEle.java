package ArrayPractice;

import java.util.HashMap;

public class Q25FreqEachEle {
    public static void main(String[] args) {
        int[] arr={2, 3, 2, 5, 3, 2, 5, 4};
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        System.out.println(hm);
    }
}
