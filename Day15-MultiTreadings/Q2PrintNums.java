public class Q2PrintNums {
    public static void main(String[] args) {
        NumberThread mt=new NumberThread();
        mt.start();
    }
}

class NumberThread extends Thread{
    @Override
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(i);
        }
    }
}
