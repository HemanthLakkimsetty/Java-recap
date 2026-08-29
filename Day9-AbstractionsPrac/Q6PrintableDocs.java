package AbstractionsPrac;

public class Q6PrintableDocs {
    public static void main(String[] args) {
        Printable p=new Documents();
        p.printdoc();
    }
}

interface Printable{
    void printdoc();
}

class Documents implements Printable{
    public void printdoc(){
        System.out.println("Printing Document content..\n" + "Printing Image file...");
    }
}