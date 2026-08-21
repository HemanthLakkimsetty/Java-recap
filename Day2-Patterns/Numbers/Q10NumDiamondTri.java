package Patterns.Numbers;

public class Q10NumDiamondTri {
    public static void main(String[] args) {
        int n=5;
        int a=n/2+1;
        for(int i=1;i<=a;i++){
            for(int j=a;j>i;j--){
                System.out.print(" ");
            }
            for(int j=1;j<i;j++){
                System.out.print(j);
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i=a-1;i>=1;i--){
            for(int j=a;j>i;j--){
                System.out.print(" ");
            }
            for(int j=1;j<i;j++){
                System.out.print(j);
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
        
    }
    
}
