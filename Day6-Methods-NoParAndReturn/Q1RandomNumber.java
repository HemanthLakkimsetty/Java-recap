package NoParAndReturn;

public class Q1RandomNumber {
    int getRandomNumber() {
        return (int) (Math.random() * 100) + 1;
    }

    public static void main(String[] args) {
        Q1RandomNumber obj = new Q1RandomNumber();

        System.out.println(obj.getRandomNumber());
    }

}
