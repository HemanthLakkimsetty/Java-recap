public class Q2InsertStringSpeci {
    public static void main(String[] args) {
        String str="HelloWorld";
        String s="java";
        int pos=5;
        StringBuilder sb=new StringBuilder(str);
        sb.insert(pos,s);
        System.out.println(sb.toString());
        
    }
}
