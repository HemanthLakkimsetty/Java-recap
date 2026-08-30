package inheritancePrac;

public class Q7Accounts {
    public static void main(String[] args) {

        SA s = new SA(50000, 4.0);
        FD f = new FD(100000, 7.5, 2);

        System.out.println("Savings Interest: " + s.interest());
        System.out.println("FD Interest: " + f.interest());
    }
}

class Account {
    protected double bal;

    Account(double b) {
        bal = b;
    }

    double interest() {
        return 0;
    }
}

class SA extends Account {
    double rate;

    SA(double b, double r) {
        super(b);
        rate = r;
    }

    double interest() {
        return bal * rate / 100;
    }
}

class FD extends Account {
    double rate;
    int yr;

    FD(double b, double r, int y) {
        super(b);
        rate = r;
        yr = y;
    }

    double interest() {
        return bal * rate * yr / 100;
    }
}