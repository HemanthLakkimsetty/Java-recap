import java.util.*;
public class Q1PrintEle{
    public static void main(String[] args) {
        List<Integer> ls=List.of(10,20,30,40,50);
        ls.stream().forEach(System.out::println);
    }
}