public class Q5Create2threads {
    public static void main(String[] args) {
        Thread t1=new Thread(()->{
            for(int i=1;i<=5;i++){
                System.out.println("A: "+i);
            }
        });

        Thread t2=new Thread(()->{
            for(int i=1;i<=5;i++){
                System.out.println("B: "+i);
            }
        });

        t1.start();
        t2.start();
    }
}
