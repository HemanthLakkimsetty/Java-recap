import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Q1ArrayListIntro{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> al=new ArrayList<>();
        while(true){
            System.out.println("Do u want to enter the value \n1.yes\n2.no");
            int opt=sc.nextInt();
            if(opt==1){
                Integer i=sc.nextInt();
                al.add(i);
            }
            else if(opt==2){
                break;
            }
            System.out.print("Curent array list value: ");
            for(int i:al){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.print("Final values stored in list:");
        for(int i: al){
            System.out.print(i+" ");
        }
        sc.close();
    }
}