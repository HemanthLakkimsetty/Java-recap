public class Q2LambdaIntro{
    public static void main(String[] args){
        Calculator add=(a,b)->a+b;
        Calculator sub=(a,b)->a-b;
        Calculator mul=(a,b)->a*b;
        Calculator div=(a,b)->{if(a<b||b==0)
            return 0;
        return a/b;
        };

        System.out.println(add.cal(10,20));
        System.out.println(sub.cal(10, 5));
        System.out.println(mul.cal(2,2));
        System.out.println(div.cal(8,2));
    }
}

interface Calculator{
    int cal(int a,int b);
}