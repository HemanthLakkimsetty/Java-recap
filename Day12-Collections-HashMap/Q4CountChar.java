import java.util.HashMap;

public class Q4CountChar {
    public static void main(String[] args) {
        String str="Programming";
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char ch:str.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        System.out.println(hm);
    }
}
