public class Q3RunnableIntro {
    public static void main(String[] args) {
        MyThread mt=new MyThread();
        Thread t=new Thread(mt);
        t.start();
    }
}

class MyThread implements Runnable{
    @Override
    public void run(){
        System.out.println("Class with runnable interface to call thread".toUpperCase());
    }
}
