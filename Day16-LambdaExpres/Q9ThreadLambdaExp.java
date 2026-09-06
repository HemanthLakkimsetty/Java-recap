public class Q1LambdaExp{
    public static void main(String[] args) {
        System.out.println();
        Thread t=new Thread(()->System.out.println("Hello is printed by using lambda expression"));
        t.start();
    }
    
}