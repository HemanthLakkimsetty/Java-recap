public class Q5NumCheck {
    public static void main(String[] args) {
        checking(21, n->n%2==0);
        checking(92, n->n%2!=0);
        checking(-2,n->n>0);
        checking(11,n->n>100);
    }

    static void checking(int n,NumberCheck nc){
        System.out.println(nc.check(n));
    }
}

@FunctionalInterface
interface NumberCheck{
    boolean check(int a);
}