import java.util.List;

public class Q20AllMatch {
    public static void main(String[] args) {
        List<Integer> nums=List.of(5, 10, 15, 20, 25);

        boolean isAllNumsPos=nums.stream()
            .allMatch(x -> x > 0);
        
        System.out.println((isAllNumsPos)?"All Nums are Pos":"One Num or More Nums are Neg");
    }
}
