public class Q4LambdaRunnable {
    public static void main(String[] args) {
        Thread t=new Thread(()->{
                System.out.println("lambda expression for runnale interface");
        });
        t.start();
    }
}
