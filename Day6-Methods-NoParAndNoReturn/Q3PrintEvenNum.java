public class Q3PrintEvenNum {
    void printEvenNumbers(){
        for(int i=2;i<=100;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        Q3PrintEvenNum pe=new Q3PrintEvenNum();
        pe.printEvenNumbers();
    }
}
