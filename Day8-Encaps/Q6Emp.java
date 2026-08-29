package Encaps;

public class Q6Emp {

    public static void main(String[] args) {
        Q6Emp emp = new Q6Emp();

        emp.setSalary(50000);
        emp.setBonus(8000);

        System.out.println("Salary: " + emp.getSalary());
        System.out.println("Bonus: " + emp.getBonus());
    }

    private double salary;
    private double bonus;

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setBonus(double bonus) {
        if (bonus <= salary * 0.20) {
            this.bonus = bonus;
        } else {
            System.out.println("Bonus cannot exceed 20% of salary.");
        }
    }

    public double getBonus() {
        return bonus;
    }
}