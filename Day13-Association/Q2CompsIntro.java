public class Q2CompsIntro {
    public static void main(String[] args) {
        
    }
}

class Engine{
    void display(){
        System.out.println("Engine is added");
    }
}

class Bike{
    Engine e;
    Bike(){
        e=new Engine();
        e.display();
    }
}
