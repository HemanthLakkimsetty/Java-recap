public class Q2EvenOrOdd {
    public static void main(String[] args) {
        System.out.println(isNumberEvenOrOdd(9));
    }
    static String isNumberEvenOrOdd(int n){
        return n%2==0?"Even":"Odd";
    }
}
