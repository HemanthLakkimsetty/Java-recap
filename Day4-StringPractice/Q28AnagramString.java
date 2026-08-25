package StringPractice;
import java.util.HashMap;
public class Q28AnagramString {
    public static void main(String[] args) {
        String s1="Listen".toLowerCase();
        String s2="Silet".toLowerCase();

        HashMap<Character,Integer>hm=new HashMap<>();
        boolean ana=true;
        for(char ch:s1.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }

        for(char ch:s2.toCharArray()){
            if(!hm.containsKey(ch)){
                System.out.println("not Anagrams");
                ana=false;
                break;
            }
            if(hm.get(ch)==1){
                hm.remove(ch);
            }else{
                hm.put(ch,hm.get(ch)-1);
            }
        }
        if(hm.isEmpty() && ana){
            System.out.println("Anagrams");
        }else{
            System.out.println("Not Anagram");
        }
    }
}
