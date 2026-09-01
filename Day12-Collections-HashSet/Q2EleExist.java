import java.util.*;
public class Q2EleExist {
    public static void main(String[] args) {
        HashSet<Integer>hs=new HashSet<>(Arrays.asList(1,2,3,4));
        int val=9;
        if(hs.contains(val)){
            System.out.println("Exists");
        }else{
            System.out.println("Not Exists");
        }
    }
}
