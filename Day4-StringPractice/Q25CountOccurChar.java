package StringPractice;
import java.util.*;
public class Q25CountOccurChar {
    public static void main(String[] args) {
        String str="Banana";
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char ch: str.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        System.out.println(hm);
    }
}
