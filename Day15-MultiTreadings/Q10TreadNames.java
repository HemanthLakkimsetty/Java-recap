public class Q10TreadNames {
    public static void main(String[] args) {
        Thread t=new Thread(()->{
            System.out.println("is working...");
        },"Downloader");

        Thread t2=new Thread(()->{
            System.out.println("is working...");
        },"Uploader");


        System.out.print(t.getName());
        t.start();
        try{
            t.join();
        }catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }
        System.out.print(t2.getName()+" ");
        t2.start();
    }
}
