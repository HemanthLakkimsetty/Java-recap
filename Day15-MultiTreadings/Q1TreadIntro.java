class MyTread extends Thread{
    @Override
    public void run(){
        System.out.println("run()--> overridden");
    }
}

public class Q1TreadIntro{
    public static void main(String[] args) {
        MyTread mt=new MyTread();
        mt.start();
    }
}