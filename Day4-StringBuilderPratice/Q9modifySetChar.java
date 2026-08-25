public class Q9modifySetChar {
    public static void main(String[] args) {
        String str="JAva";
        int i=1;
        char ch='a';
        StringBuilder sb=new StringBuilder(str);
        sb.setCharAt(i,ch);
        System.out.println(sb.toString());
    }
}
