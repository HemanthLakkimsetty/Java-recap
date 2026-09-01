import java.util.ArrayList;
import java.util.Arrays;

public class Q9ListToArr {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        for(int i: al){
            System.out.println(i);
        }
    }
}
