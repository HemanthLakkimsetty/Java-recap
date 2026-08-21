package Patterns.Alphabets;

public class Q3RightAlphaTri {
    public static void main(String[] args) {
        char ch='A';
        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)(ch+j));
            }
            System.out.println();
        }
    }
}
