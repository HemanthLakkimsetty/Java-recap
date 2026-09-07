import java.util.function.Supplier;

public class Q2SupplierRandomNum {
    public static void main(String[] args) {
        Supplier<Integer> randomNumber=()->(int)(Math.random()*100);

        for(int i=1;i<=10;i++){
            System.out.println(randomNumber.get());
        }
    }
}
