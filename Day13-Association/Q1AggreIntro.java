public class Q1AggreIntro{
    public static void main(String[] args){
        MusicPlayer mp=new MusicPlayer();
        Truck t=new Truck("Bajaj",mp);
        t.display();
    }
}

abstract class Vehicle{
    abstract void display();
}
//is-a relations
class Truck extends Vehicle{
    String name;
    MusicPlayer mp;
    Truck(String name,MusicPlayer mp){
        this.mp=mp;
        this.name=name;
        mp.play();
    }
    @Override
    void display(){
        System.out.println("Vehicle name"+name);
    }
}

//has-a relationship
class MusicPlayer{
    void play(){
        System.out.println("Music is Playing");
    }
}