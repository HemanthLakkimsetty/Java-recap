public class Q7DelayedDownloadPrinting {
    public static void main(String[] args) {
        Thread t=new Thread(()->{
            System.out.println("Downloading....");
            for(int i=0;i<=100;i+=10){
                System.out.println(i+"%");
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println("Downloading compleated");
        });
        t.start();
    }
}
