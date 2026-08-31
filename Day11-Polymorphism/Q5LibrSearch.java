package Poly;

public class Q5LibrSearch {
    public static void main(String[] args) {
        search("java");
        search("java","hemanth");
        search(2025);
    }

    static void search(String title){
        System.out.println("Found book "+title +" by using Book Name");
    }

    static void search(String title,String author){
        System.out.println("Found by book "+title+" by using autor name:"+author);
    }

    static void search(int year){
        System.out.println("found books by year :"+year);
    }
}


