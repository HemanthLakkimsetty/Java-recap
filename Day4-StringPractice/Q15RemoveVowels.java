package StringPractice;

public class Q15RemoveVowels {
    public static void main(String[] args) {
        String str="Programming".toLowerCase().trim().replaceAll("[aeiou]","");
        System.out.println(str);

        
    }
}
