package Patterns.Alphabets;

public class Q7HollowAlpha {
    public static void main(String[] args) {
        char ch='A';
        for(int i=0;i<5;i++){
            for(int j=0;j<=4;j++){
                if(i==0||i==4||j==0||j==4){
                    System.out.print((char)(ch+i));
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
