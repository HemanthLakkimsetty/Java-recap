package Patterns.Alphabets;

public class Q4InvertAlphaTri {
    public static void main(String[] args) {
        char ch='A';
        for(int i=4;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print((char)(ch+j));
            }
            System.out.println();
        }
    }
}
