import java.util.List;

public class Q21NoneMatch {
    public static void main(String[] args) {
        List<Integer> nums=List.of(10, 25, 40, 5, 80);

        boolean noNegList=nums.stream().noneMatch(x->x<0);

        if(noNegList)
            System.out.println("List does not contain Negitive nums: "+nums);
        else
            System.out.println("List contain negitive nums: "+nums);
    }
    
}
