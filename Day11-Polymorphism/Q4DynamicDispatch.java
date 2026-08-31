package Poly;

public class Q4DynamicDispatch {
    public static void main(String[] args) {
        Shape03[] arr=new Shape03[3];
        arr[0]=new Circle();
        arr[1]=new Square();
        arr[2]=new Triangle();

        for(Shape03 s: arr){
            s.draw();
        }
    }
}

abstract class Shape03{
    abstract void draw();
}

class Circle extends Shape03{
    @Override
    void draw(){
        System.out.println("Drawing Circle");
    }
}

class Square extends Shape03{
    @Override
    void draw(){
        System.out.println("Drawing Square");
    }
}

class Triangle extends Shape03{
    @Override
    void draw(){
        System.out.println("Drawing Traingle");
    }
}
