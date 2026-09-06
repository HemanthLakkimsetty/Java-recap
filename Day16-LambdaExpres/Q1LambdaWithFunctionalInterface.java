interface FunctionalInterfaceForLambda{
    abstract String name();

    default void defaultMethod(){
        System.out.println("Hi , its default method from interface");
    }
}
//no need of implemention class for Functional Interfaces
public class Q7LambdaWithFunctionalInterface{
    public static void main(String[] args) {
        FunctionalInterfaceForLambda lfi=()->"Hemanth";
        System.out.println(lfi.name());

        lfi.defaultMethod();

    }
}

