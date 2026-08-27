public class Q6RightStarTri {
    public static void main(String[] args) {
        Q6RightStarTri sp=new Q6RightStarTri();
        sp.printPattern(5);
    }

    void printPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
