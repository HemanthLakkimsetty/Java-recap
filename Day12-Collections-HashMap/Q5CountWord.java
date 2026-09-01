import java.util.*;
public class Q5CountWord {
    public static void main(String[] args) {
        String str="Java is fun and Java is powerful".toLowerCase();
        String[] s=str.split(" ");
        HashMap<String,Integer>hm=new HashMap<>();
        for(String st:s){
            hm.put(st,hm.getOrDefault(st,0)+1);
        }
        System.out.println(hm);
    }
}
