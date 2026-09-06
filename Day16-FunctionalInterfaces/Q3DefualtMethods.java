public class Q3DefualtMethods implements Parent{
    public static void main(String[] args) {
        new Q3DefualtMethods().method1();
    }
}

interface Parent{
    default void method1(){
        System.out.println("its a defualt method from interface");
    }
}