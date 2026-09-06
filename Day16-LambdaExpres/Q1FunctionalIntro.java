public class Q1FunctionalIntro {
    public static void main(String[] args) {
        Calculator add=new Calculator() {
            @Override
            public int cal(int a,int b){
                return a+b;
            }
        };

        Calculator sub=new Calculator() {
            @Override
            public int cal(int a,int b){
                return a-b;
            }
        };

        Calculator mul=new Calculator() {
            @Override
            public int cal(int a,int b){
                return a*b;
            }
        };

        Calculator div=new Calculator() {
            @Override
            public int cal(int a,int b){
                try{
                    return a/b;
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }
                return a/b;
            }
        };

        System.out.println(add.cal(10, 20));
        System.out.println(sub.cal(20, 5));
        System.out.println(mul.cal(2, 5));
        System.out.println(div.cal(9, 3));
    }
}

interface Calculator01{
    int cal(int a,int B);
}