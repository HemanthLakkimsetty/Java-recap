import java.util.List;

public class Q6NameGreatherX {
    public static void main(String[] args) {
        List<String> names =
        List.of("Ravi", "Anil", "Kiran", "Raj", "Suresh");

        PrintNameGreatenThanX(names, 4);
    }
    static void PrintNameGreatenThanX(List<String> names,int x){
        names.stream()
                    .filter(n->n.length()>x)
                    .forEach(System.out::println);
    }
}
