import java.util.*;

public class Q1HashsetIntro{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashSet<Integer>hs=new HashSet<>();
        int noOfValues=sc.nextInt();
        for(int i=1;i<=noOfValues;i++){
            int val=sc.nextInt();
            hs.add(val);
        }
        System.out.println(hs);
        sc.close();
    }
}