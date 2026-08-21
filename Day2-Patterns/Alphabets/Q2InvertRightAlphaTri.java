package Patterns.Alphabets;

public class Q2InvertRightAlphaTri {
    public static void main(String[] args) {
        char ch='A';
        for(int i=4;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print((char)(ch+i));
            }
            System.out.println();
        }
    }
}
