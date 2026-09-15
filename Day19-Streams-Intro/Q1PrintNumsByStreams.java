import java.util.List;

class Q1PrintNumByStreams{
    public static void main(String[] args){
        List<Integer> nums=List.of(1,2,3,4,5);

        nums.stream().forEach(System.out::println);
    }
}