import java.util.Scanner;

public class Q3NumParseExcep {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        System.out.println(isNumber(a));
        sc.close();
    }
    static boolean isNumber(String s){
        try{
            Integer.parseInt(s);
            return true;
        }
        catch(NumberFormatException e){
            return false;
        }
    }
}
