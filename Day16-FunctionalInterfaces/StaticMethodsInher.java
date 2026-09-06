public class StaticMethodsInher implements A{
    public static void main(String[] args) {
        A.m1();
        //anonymous obj used here
        new StaticMethodsInher().m2();
    }
}

interface A{
    //static method cant be override and accessed by only interface name only
    //implemention class cant see static methods and cant access them
    public static void m1(){
        System.out.println("Static method from interface");
    }
    default void m2(){
        System.out.println("Default method from interface ");
    }
}
