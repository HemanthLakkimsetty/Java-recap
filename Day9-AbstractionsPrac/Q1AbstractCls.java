package AbstractionsPrac;

public class Q1AbstractCls{
    public static void main(String[] args) {
        Shape02 s1=new Circle01(5);
        Shape02 s2=new Rectangle01(4, 6);
        s1.calArea();
        s2.calArea();

    }
}

abstract class Shape02{
    abstract void calArea();
}

class Circle01 extends Shape02{
    int rad;
    Circle01(int rad){
        this.rad=rad;
    }

    void calArea(){
        System.out.printf("%.2f%n",(Math.PI*rad*rad));
    }

}

class Rectangle01 extends Shape02{
    int l;
    int b;
    Rectangle01(int l,int b){
        this.l=l;
        this.b=b;
    }

    void calArea() {
        System.out.println(l*b);
    }

}