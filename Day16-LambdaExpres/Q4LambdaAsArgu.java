public class Q4LambdaAsArgu {
    public static void main(String[] args) {
        execute(1, 2, (a,b)->a+b);
        execute(1, 2, (a,b)->a-b);
        execute(2, 2, (a,b)->a*b);
    }

    static void execute(int a,int b,Cal c){
        int res=c.cal(a,b);
        System.out.println(res);
    }
}

@FunctionalInterface
interface Cal{
    int cal(int a,int b);
}
