@FunctionalInterface
//inside inteface allows defualt and static methods
//functional interface has only one abstract method and any number of other methods
interface FuncInterface{
    public void greetMe();

    default void method1(){
        System.out.println("Its a defualt method in Functional interface");
    }

    public static void method2(){
        System.out.println("Its a static method in Functional interface");
    }
}



class Q2FunctionalInterfaces implements FuncInterface{
    public void greetMe(){
        System.out.println();
        System.out.println("Hello is printed by using Functional interface");
    }
    public static void main(String[] args) {
        new Q2FunctionalInterfaces().greetMe();
        new Q2FunctionalInterfaces().method1();
        FuncInterface.method2();
    }
}