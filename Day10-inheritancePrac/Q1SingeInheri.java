package inheritancePrac;

public class Q1SingeInheri {
    public static void main(String[] args) {
        Vehicle vc=new Car("Honda",120,4);
        vc.display();
    }
}

class Vehicle{
    String brand;
    int speed;
    public Vehicle(String brand,int speed){
        this.brand=brand;
        this.speed=speed;
    }

    public void display(){
        System.out.println("Brand: "+brand+"\n"+"Speed: "+speed);
    }
}

class Car extends Vehicle{
    int doors;
    public Car(String brand,int speed,int doors){
        super(brand,speed);
        this.doors=doors;
    }

    public void display(){
        System.out.println("Brand: "+brand+"\n"+"Speed: "+speed+"km/h\n"+"Doors:"+doors);
    }
}