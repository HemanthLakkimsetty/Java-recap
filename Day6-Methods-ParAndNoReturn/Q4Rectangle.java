package ParAndNoReturn;

public class Q4Rectangle {
    public static void main(String[] args) {
        Q4Rectangle rect=new Q4Rectangle();
        rect.printRect(4,6);
    }

    void printRect(int a,int b){
        for(int i=1;i<=a;i++){
            for(int j=1;j<=b;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
