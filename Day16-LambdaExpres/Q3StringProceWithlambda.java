public class Q3StringProceWithlambda {
    public static void main(String[] args) {
        StringProcess s=(x)->x.toUpperCase();
        StringProcess s2=(x)->x.toLowerCase();
        System.out.println(s.con("Hello java"));
        System.out.println(s2.con("HELLO JAVA"));
    }
}

@FunctionalInterface
interface StringProcess{
    String con(String str);
}

