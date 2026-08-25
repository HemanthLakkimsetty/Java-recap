public class Q6SbToStr {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Java Programming");
        String s1=sb.toString();
        String s2=String.valueOf(sb);
        System.out.println(s1+"\n"+s2);
    }
}
