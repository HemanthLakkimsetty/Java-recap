import java.util.*;
public class Q3MapStream {
    public static void main(String[] args){
        Map<Integer,String> map=Map.of(1,"Hi",
                                        2,"Hlo",3,"Hrw",4,"bye");

        map.entrySet().stream().forEach(System.out::println);

        map.keySet().stream()
                    .forEach(System.out::println);

        map.values().stream()
                    .forEach(System.out::println);
    }
}
