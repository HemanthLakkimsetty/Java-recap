import java.util.*;
public class Q2CheckKeyContain {
    public static void main(String[] args) {
        HashMap <Integer,String> hm=new HashMap<>(Map.of(1,"abc",2,"def",3,"ghi"));
        if(hm.containsKey(3)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        if(hm.containsValue("df")){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
