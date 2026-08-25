public class Q1AppendMulVal {
    public static void main(String[] args) {
        String str="java";
        int n=2025;
        char ch='!';
        StringBuilder sb=new StringBuilder();
        sb.append(str).append(n).append(String.valueOf(ch));
        System.out.print(sb);
    }
}
