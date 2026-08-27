package ParAndNoReturn;

public class Q3EvenOdd {
    public static void main(String[] args) {
        Q3EvenOdd eo=new Q3EvenOdd();
        eo.checkEvenOdd(39);
    }

    void checkEvenOdd(int num){
        System.out.println(num%2==0?"Even":"Odd");
    }
}
