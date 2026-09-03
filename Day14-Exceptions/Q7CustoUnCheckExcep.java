import java.util.Scanner;

public class Q7CustoUnCheckExcep {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BankWithdrawClass bw=new BankWithdrawClass();
        try{
            int amt=sc.nextInt();
            bw.withdrawMethod(amt);
        }catch(InvalidInputException e){
            System.out.println(e.getMessage());
        }finally{
            sc.close();
        }
    }
}

class InvalidInputException extends RuntimeException{
    public InvalidInputException(String message){
        super(message);
    }
}


class BankWithdrawClass{
    int bal=500000;
    public void withdrawMethod(int amt){
        if(amt<0){
            throw new InvalidInputException("Error: Invalid amount -->withdraw amt cant in neg!"+amt);
        }
        if(bal<amt){
            throw new InvalidInputException("Error: Insuffecient funds in ur account");
        }
        bal-=amt;
        System.out.println("Withdrawn succesfully");
        System.out.println("Current amt: "+bal);
    }
}