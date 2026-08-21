import java.util.HashSet;
import java.util.Scanner;
public class Q22CommonEle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashSet<Integer> hs=new HashSet<>();
        int s1=sc.nextInt();
        int[] a1=new int[s1];
        for(int i=0;i<a1.length;i++){
            a1[i]=sc.nextInt();
            hs.add(a1[i]);
        }

        int s2=sc.nextInt();
        int[] a2=new int[s2];
        for(int i=0;i<a2.length;i++){
            a2[i]=sc.nextInt();
        }
        for(int i=0;i<a2.length;i++){
            if(hs.contains(a2[i])){
                System.out.print(a2[i]+" ");
            }
        }
        sc.close();
    }
}
