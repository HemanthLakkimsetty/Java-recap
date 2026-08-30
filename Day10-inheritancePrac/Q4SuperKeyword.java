package inheritancePrac;

public class Q4SuperKeyword {
    public static void main(String[] args) {
        Animal a=new Dog("Animal","Dog","Bark");
        a.display();
    }
}

class Animal{
    String type;
    public Animal(String type){
        this.type=type;
    }

    public void display(){
        System.out.println("Type: "+type);
    }
}

class Dog extends Animal{
    String name;
    String sound;
    public Dog(String type,String name,String sound){
        super(type);
        this.name=name;
        this.sound=sound;
    }

    public void display(){
        super.display();
        System.out.println("Name: "+name+"\n"+"Sound: "+sound);
    }
}
