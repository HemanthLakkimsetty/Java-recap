import java.util.Scanner;

public class Q10BaseConv {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String num=sc.next();
        int base=sc.nextInt();
        int baseCon=sc.nextInt();

        int dec=Integer.parseInt(num,base);
        String ans=Integer.toString(dec,baseCon);
        System.out.println(ans);
        sc.close();
    }
}
