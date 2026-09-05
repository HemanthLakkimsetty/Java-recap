public class Q9ThreadLifeCycle {
    public static void main(String[] args) {
        Thread t=new Thread(()->{
            System.out.println("RUNNING");
        });
        System.out.println(t.getState());
        t.start();
        System.out.println(t.getState());
        try{
            t.join();
        }catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }
        System.out.println(t.getState());
    }
}
