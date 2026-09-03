public class Q1ArtheExcep{
    public static void main(String[] args){
        int ans=0;
        try{
            ans=10/0;
            System.out.println(ans);
        }catch(ArithmeticException e){
            System.out.println("Exception: U CANNOT DIVIDE THE NUMERATOR BY ZERO "+e.getMessage());
        }
    }
}