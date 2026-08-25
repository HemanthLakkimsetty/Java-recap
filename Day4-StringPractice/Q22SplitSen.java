package StringPractice;

public class Q22SplitSen {
    public static void main(String[] args) {
        String str="Java is Platform independent";
        String[] arr=str.split(" ");
        for(String s: arr){
            System.out.println(s);
        }
    }
}
