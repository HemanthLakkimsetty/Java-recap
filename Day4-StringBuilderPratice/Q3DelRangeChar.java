public class Q3DelRangeChar {
    public static void main(String[] args) {
        String str="Programming";
        int s=3;
        int e=7;
        StringBuilder sb=new StringBuilder(str);
        sb.delete(s, e);
        System.out.println(sb.toString());
    }
}
