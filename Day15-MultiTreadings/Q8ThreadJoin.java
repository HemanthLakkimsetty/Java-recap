public class Q8ThreadJoin {
    public static void main(String[] args) {
        Thread t=new Thread(()->{
            for(int i=0;i<=5;i++){
                System.out.println("worker "+i);
                try{
                    Thread.sleep(500);
                }catch(InterruptedException e){
                    Thread.currentThread().interrupt();
                }
            }
        });
        System.out.println("Main Thread: Workers counting start");

        t.start();
        
        try{
            t.join();
        }catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }
        
        System.out.println("Workers counting completed!");
    }
}
