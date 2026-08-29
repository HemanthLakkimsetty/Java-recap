package Encaps;

import java.util.Scanner;

public class Q4Battery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Battery b = new Battery();

        int start = sc.nextInt();
        int charge = sc.nextInt();
        int use = sc.nextInt();

        b.setBattPer(start);
        b.charge(charge);
        b.use(use);

        System.out.println("Battery Percentage: "
                + b.getBattPer() + "%");
                sc.close();
    }
}

class Battery {
    private int battPer;

    public void setBattPer(int battPer) {
        if (battPer >= 0 && battPer <= 100) {
            this.battPer = battPer;
        }
    }

    public int getBattPer() {
        return battPer;
    }

    public void charge(int amount) {
        battPer = battPer + amount;

        if (battPer > 100) {
            battPer = 100;
        }
    }

    public void use(int amount) {
        battPer = battPer - amount;

        if (battPer < 0) {
            battPer = 0;
        }
    }
}