import java.util.*;
public class Q12PrimeFact {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=2;
        while(n>1){
            if(n%i==0){
                System.out.print(i+" ");
                n/=i;
            }else{
                i++;
            }
            
        }

        sc.close();
    }
}
