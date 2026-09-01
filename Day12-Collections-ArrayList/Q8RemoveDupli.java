import java.util.ArrayList;
import java.util.Arrays;

public class Q8RemoveDupli {
    public static void main(String[] args) {
        ArrayList<Integer> a1=new ArrayList<>(Arrays.asList(1,1,1,2,2,3,3,4,5,5,5));
        ArrayList<Integer> a2=new ArrayList<>();

        for(int i:a1){
            if(!a2.contains(i)){
                a2.add(i);
            }
            else{
                continue;
            }
        }
        System.out.println(a2);
    }
}
