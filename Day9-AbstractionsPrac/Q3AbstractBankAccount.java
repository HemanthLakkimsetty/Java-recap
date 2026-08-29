package AbstractionsPrac;

public class Q3AbstractBankAccount {
    public static void main(String[] args) {
        BankAccount ba1=new Savings(20000,5);
        BankAccount ba2=new Current();
        ba1.calInter();
        ba2.calInter();
        
    }
}

abstract class BankAccount{
    abstract void calInter();
}

class Savings extends BankAccount{
    int bal;
    double inter;
    Savings(int bal,double inter){
        this.bal=bal;
        this.inter=inter;
    }
    void calInter(){
        System.out.println((bal*inter*1)/100);
    }
}

class Current extends BankAccount{
    void calInter(){
        System.out.println(0.0);
    }
}


