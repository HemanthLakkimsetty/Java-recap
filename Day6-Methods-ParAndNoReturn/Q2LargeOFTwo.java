package ParAndNoReturn;

public class Q2LargeOFTwo {
    public static void main(String[] args) {
        Q2LargeOFTwo lt=new Q2LargeOFTwo();
        lt.displayLarge(48,72);
    }

    void displayLarge(int a,int b){
        System.out.println(a>b?a:b);
    }
}
