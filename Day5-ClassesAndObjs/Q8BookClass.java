import java.util.Scanner;

public class Q8BookClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String title = sc.next();
        String author = sc.next() + " " + sc.next();
        int year = sc.nextInt();

        Book book = new Book(title, author, year);
        book.displayDetails();

        sc.close();
    }
}

class Book {
    String title;
    String author;
    int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + year);
    }
}