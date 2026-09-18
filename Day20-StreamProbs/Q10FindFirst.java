import java.util.*;

public class Q10FindFirst {
    public static void main(String[] args) {
        List<Integer> nums=List.of(20, 40, 55, 70, 90);

        Optional<Integer> op=nums.stream().filter(x->x>50).findFirst();
        System.out.println(op);
    }
    
}
