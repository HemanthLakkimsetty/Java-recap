import java.util.*;
public class Q10RemoveDupliWord {
    public static void main(String[] args) {
        String str="Java is great and Java is fast";
        String[] arr=str.split(" ");
        Set<String>hs=new LinkedHashSet<>(Arrays.asList(arr));
        System.out.println(hs);
    }
}
