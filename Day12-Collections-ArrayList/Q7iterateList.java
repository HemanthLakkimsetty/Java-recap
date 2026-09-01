import java.util.ArrayList;
import java.util.Arrays;

public class Q7iterateList {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>(Arrays.asList(6,7,0,8,9,1,2,3,4,5));
        for(int i: al){
            System.out.println(i);
        }

        for(int i=0;i<al.size();i++){
            System.out.print(al.get(i)+" ");
        }
    }
}
