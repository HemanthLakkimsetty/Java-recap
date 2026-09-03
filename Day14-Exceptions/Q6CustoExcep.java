import java.util.Scanner;

public class Q6CustoExcep {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BankBalance bb=new BankBalance();
        try{
            int amt=sc.nextInt();
            bb.withdrawFunds(amt);
        }catch(InsufficentFundsException e){
            System.out.println(e.getMessage());
        }finally{
            sc.close();
        }
    }
    
}

class InsufficentFundsException extends Exception{
    //constructor
    public InsufficentFundsException(String message){
        super(message);
    }
}

class BankBalance {
    int balance=50000;
    public void withdrawFunds(int amt) throws InsufficentFundsException{
        if(balance<amt){
            throw new InsufficentFundsException("Withdraw failed"+balance+"Requested funds:"+amt);
        }else{
            balance=-amt;
            System.out.println("withdrawn successfully");
            System.out.println("current amt:"+balance);
        }
    }
}
