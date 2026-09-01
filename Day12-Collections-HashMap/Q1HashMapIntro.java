import java.util.*;

public class Q1HashMapIntro{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int noOfVal=sc.nextInt();
        HashMap<Integer,String>hm=new HashMap<>();
        for(int i=1;i<=noOfVal;i++){
            int key=sc.nextInt();
            String str=sc.next();
            hm.put(key,str);
        }
        System.out.println(hm);
        sc.close();
    }
    
}