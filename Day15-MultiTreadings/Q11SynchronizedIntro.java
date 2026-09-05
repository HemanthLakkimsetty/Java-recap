class Q11SynchronizedIntro{
    static int cnt=0;
    public static void main(String[] args) {
        Thread t1=new Thread(()->{
            for(int i=0;i<10;i++){
                System.out.println(incrementCount());
            }
        });
        Thread t2=new Thread(()->{
            for(int i=0;i<10;i++){
                System.out.println(incrementCount());
            }
        });

        t1.start();
        t2.start();
        
        try{
            t1.join();
            t2.join();
        }catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }

    }
    synchronized static int incrementCount(){
        return cnt+=1;
    }
}
