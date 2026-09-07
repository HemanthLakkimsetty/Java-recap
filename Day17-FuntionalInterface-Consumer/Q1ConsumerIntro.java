import java.util.function.Consumer;
public class Q1ConsumerIntro{
    public static void main(String[] args) {
        //Consumer consumes and does not return anything
        Consumer<String> display=(str)->System.out.println(str+" is said by Consumer functional Interface");

        display.accept("Hi");

    }
}