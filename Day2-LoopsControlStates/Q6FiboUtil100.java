package LoopsControlStates;

public class Q6FiboUtil100 {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int temp=0;
        System.out.print(a+" "+b+" ");
        while(true){
            if(a+b>=100){
                break;
            }
            temp=a+b;
                a=b;
                b=temp;
                System.out.print(b+" ");
        }
    }
}
