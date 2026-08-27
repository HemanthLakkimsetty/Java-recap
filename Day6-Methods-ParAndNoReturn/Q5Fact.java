package ParAndNoReturn;

public class Q5Fact {
    public static void main(String[] args) {
        Q5Fact fa=new Q5Fact();
        fa.printFact(5);
    }

    void printFact(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            System.out.println(fact*=i);
        }
    }
}
