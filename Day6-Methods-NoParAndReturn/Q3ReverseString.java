package NoParAndReturn;

public class Q3ReverseString {
    public static void main(String[] args) {
        Q3ReverseString rs=new Q3ReverseString();
        
        System.out.println(rs.reverseStr());
    }

    String reverseStr(){
        java.util.Scanner sc=new java.util.Scanner(System.in);
        String str=sc.next();
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        sc.close();
        return sb.toString();
    }
}
