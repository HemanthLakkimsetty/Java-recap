package Patterns.Stars;

public class Q9DimondTri {
    public static void main(String[] args) {
        for(int i=1;i<=5/2;i++){
            for(int j=1;j<=(5-i)/2;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=4;i/2>=1;i--){
            for(int j=1;j<=(5-i)/2;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
