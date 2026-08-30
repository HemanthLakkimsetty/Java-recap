package inheritancePrac;

public class Q5BankAcc {
    public static void main(String[] args) {
        BankAccount ba=new SavingsAccount(10000, 5);
        ba.display();
    }
}

class BankAccount{
    int amt;

    public BankAccount(int amt){
        this.amt=amt;
    }

    public void display(){
        System.out.println(amt);
    }
}

class SavingsAccount extends BankAccount{
    double interest;

    public SavingsAccount(int amt,double interest){
        super(amt);
        this.interest=interest;
    }

    public void calInter(){
        System.out.printf("Interest:%.1f",((interest/100)*amt));
    }

    public void display(){
        System.out.println("Amount: "+amt);
        calInter();
    }
}
