import java.util.function.Function;

class Q1FunctionIntro{
    public static void main(String[] args) {
        //Function is a taking and retunring one-line method performer
        Function<String,String> hello=(str)->str;
        System.out.println(hello.apply("Hello said by Finction"));

        //inBiult -> apply(), andThen(), compose(), identity()
    }
}