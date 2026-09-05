public class Q6Concurr {
    public static void main(String[] args) {
        Thread t1=new Thread(()->{
            for(int i=1;i<6;i++){
                System.out.println("A: "+i);
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    Thread.currentThread().interrupt();
                }
            }
        });

        Thread t2=new Thread(()->{
            for(int i=1;i<6;i++){
                System.out.println("B: "+i);
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    Thread.currentThread().interrupt();
                }
            }
        });

        t1.start();
        t2.start();
    }
}


