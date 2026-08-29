package AbstractionsPrac;

public class Q5AbsEmployeeSal {
    public static void main(String[] args) {

        FullTimeEmpl fullTime = new FullTimeEmpl(60000);

        PartTimeEmpl partTime = new PartTimeEmpl(80, 500);

        System.out.println("Full-Time Salary: " + fullTime.calSal());
        System.out.println("Part-Time Salary: " + partTime.calSal());
    }
}

abstract class Empl {

    abstract double calSal();
}

class FullTimeEmpl extends Empl {

    double montSal;

    FullTimeEmpl(double montSal) {
        this.montSal = montSal;
    }

    double calSal() {
        return montSal;
    }
}

class PartTimeEmpl extends Empl {

    double hours;
    double rate;

    PartTimeEmpl(double hours, double rate) {
        this.hours = hours;
        this.rate = rate;
    }
    double calSal() {
        return hours * rate;
    }
}

