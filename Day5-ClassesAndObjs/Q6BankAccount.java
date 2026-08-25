import java.util.Scanner;

public class Q6BankAccount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        int bankId=sc.nextInt();
        int currBalance=0;
        BankAccount ba=new BankAccount(name, bankId, currBalance);
        while(true){
        System.out.println("1.show current balance\n2.withdraw\n3.Deposit\n\"4. Exit");
        int opt=sc.nextInt();
        if(opt==1){
            ba.currBalance();
        }else if(opt==2){
            System.out.println("Enter the Amount");
            int am=sc.nextInt();
            ba.withdraw(am);
            ba.currBalance();
        }else if(opt==3){
            System.out.println("Enter the Amount");
            int am=sc.nextInt();
            ba.deposit(am);
        }else if(opt==4){
            break;
        }
        else{
            System.out.println("Error : Entered Invalid Option");
        }
    }
    sc.close();
    }
}

class BankAccount{
    String name;
    int bankId;
    double currentBalance;
    public BankAccount(String name,int bankId, double currentBalance){
        this.bankId=bankId;
        this.name=name;
        this.currentBalance=currentBalance;
    }

    public void deposit(int dep){
        currentBalance+=dep;
        System.out.println(currentBalance);
    }

    public void withdraw(int am){
        if(currentBalance<=0 || am>currentBalance){
            System.out.println("Not possible to withdraw");
            return;
        }
        currentBalance-=am;
    }

    public void currBalance(){
        System.out.println(currentBalance);
    }
}