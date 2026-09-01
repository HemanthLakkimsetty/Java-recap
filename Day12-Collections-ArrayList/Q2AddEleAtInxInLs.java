import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Q2AddEleAtInxInLs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int idx=sc.nextInt();
        int val=sc.nextInt();

        addElementInList(idx,val);
        sc.close();
    }

    static void addElementInList(int idx,int val){
        System.out.println("Current List :");
        List<Integer> al=new ArrayList<>(Arrays.asList(1,2,3,5));
        for(int i:al){
            System.out.print(i+" ");
        }
        System.out.println();
        al.add(idx,val);
        System.out.println("Current List after adding: ");
        for(int i:al){
            System.out.print(i+" ");
        }

    }
}
