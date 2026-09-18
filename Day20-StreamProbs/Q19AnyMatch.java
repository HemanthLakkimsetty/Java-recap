import java.util.List;

public class Q19AnyMatch {
    public static void main(String[] args) {
        List<Integer> nums=List.of(5, 11, 17, 21, 24, 31);

        boolean isEvenList=nums.stream()
            .anyMatch(x -> x%2==0);
        
        if(isEvenList)
            System.out.println("List contain even nums");
        else
            System.err.println("List does not contain even nums");

    }
    
}
