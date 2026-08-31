package Poly;

public class Q2OveridingEx {
    public static void main(String[] args) {
        Animal a=new Dog();
        Animal b=new Cat();
        a.makeSound();
        b.makeSound();
    }
}

abstract class Animal{
    abstract void makeSound();
}

class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Dog barks");
    }
}

class Cat extends Animal{
    @Override
    void makeSound(){
        System.out.println("Cat meows");
    }
}