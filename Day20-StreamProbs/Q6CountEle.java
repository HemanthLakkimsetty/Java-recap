import java.util.*;

public class Q6CountEle {
    public static void main(String[] args) {
        List<Integer>ls=List.of(10, 20, 30, 40, 50, 60);

        int cnt=(int)(ls.stream().count());

        System.out.println(cnt);
    }
    
}
