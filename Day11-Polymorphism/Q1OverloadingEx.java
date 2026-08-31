package Poly;
public class Q1OverloadingEx{
    public static void main(String[] args) {
        mul(1,2);
        mul(2.0,3.0);
        mul(2,3,1);
    }

    static void mul(int a,int b){
        System.out.println(a*b);
    }

    static void mul(int a,int b,int c){
        System.out.println(a*b*c);
    }

    static void mul(double a,double b){
        System.out.println(a*b);
    }
}