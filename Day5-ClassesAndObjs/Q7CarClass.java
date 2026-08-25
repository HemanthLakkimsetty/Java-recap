import java.util.Scanner;

public class Q7CarClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String make = sc.next();
        String model = sc.next();
        int speed = sc.nextInt();
        int accelerateAmount = sc.nextInt();
        int brakeAmount = sc.nextInt();

        Car car = new Car(make, model, speed);

        car.accelerate(accelerateAmount);
        System.out.println(car.speed);

        car.brake(brakeAmount);
        System.out.println(car.speed);

        sc.close();
    }
}

class Car {
    String make;
    String model;
    int speed;

    public Car(String make, String model, int speed) {
        this.make = make;
        this.model = model;
        this.speed = speed;
    }

    public void accelerate(int amount) {
        speed += amount;
    }

    public void brake(int amount) {
        speed -= amount;

        if (speed < 0) {
            speed = 0;
        }
    }
}