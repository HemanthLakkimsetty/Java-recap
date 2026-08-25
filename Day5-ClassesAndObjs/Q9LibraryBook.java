import java.util.Scanner;

public class Q9LibraryBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String title = sc.next();
        String author = sc.next() + " " + sc.next();
        String operation = sc.next();

        LibraryBook book = new LibraryBook(title, author);

        if (operation.equals("Issue")) {
            book.issue();
        } else if (operation.equals("Return")) {
            book.returnBook();
        }

        sc.close();
    }
}

class LibraryBook {
    String title;
    String author;
    boolean available;

    public LibraryBook(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public void issue() {
        if (available) {
            available = false;
            System.out.println("Book Issued");
            System.out.println("Availability: Not Available");
        } else {
            System.out.println("Book is already issued");
        }
    }

    public void returnBook() {
        available = true;
        System.out.println("Book Returned");
        System.out.println("Availability: Available");
    }
}