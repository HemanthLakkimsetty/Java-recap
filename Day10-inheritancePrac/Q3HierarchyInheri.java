package inheritancePrac;

public class Q3HierarchyInheri {
    public static void main(String[] args) {
        Circle s1=new Circle(7);
        Rectangle s2=new Rectangle(5,8);
        s1.calArea();
        s2.calArea();
    }
}

class Shapes{
    public void calArea(){
        System.out.println("Area of Shapes class");
    }
}

class Circle extends Shapes{
    int radius;
    public Circle(int radius){
        this.radius=radius;
    }

    public void calArea(){
        System.out.printf("Radius: %d\nArea of Circle: %.2f\n",radius, Math.PI * radius * radius);
    }
}

class Rectangle extends Shapes{
    int length;
    int breadth;

    public Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }

    public void calArea(){
        System.out.println("Length: "+length+"\n"+"Breadth: "+breadth+"\n"+"Area of Rectangle: "+length*breadth);
    }
}