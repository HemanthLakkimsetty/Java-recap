import java.util.List;

public class Q7EvenCnt {
    public static void main(String[] args) {
        List<Integer> ls=List.of(5, 10, 12, 15, 20, 25, 30);
        int n=(int)(ls.stream().filter(x -> x%2==0)
                    .count());

        System.out.println(n);
    }
    
}
