public class Q5ReplacePartStr {
    public static void main(String[] args) {
        String str="HelloWorld";
        int s=5;
        int e=10;
        String a="Java";
        StringBuilder sb=new StringBuilder(str);
        sb.replace(s,e,a);
        System.out.println(sb.toString());

    }
}
