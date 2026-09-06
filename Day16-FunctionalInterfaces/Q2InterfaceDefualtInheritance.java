interface Parent1{
    public default void method(){
        System.out.println("Its a default method from Parent1 interface");
    }
}

interface Parent2{
    public default void method(){
        System.out.println("Its a default method from parent2 interface");
    }
}


public class Q2InterfaceDefualtInheritance implements Parent1,Parent2{
    //here we faces duplicate method Exception due to same name and same parameters
    //to correct we can use super keyword or override it so that it print any one parent class method
    @Override
    public void method(){
        Parent1.super.method();
    }
    // @Override
    // public void method(){
    //     Parent2.super.method();
    // }

    public static void main(String[] args) {
    new Q2InterfaceDefualtInheritance().method();
    }

}

