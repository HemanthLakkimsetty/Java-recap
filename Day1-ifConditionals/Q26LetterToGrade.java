import java.util.Scanner;

public class Q26LetterToGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char grade=sc.next().charAt(0);
        if(grade=='S'||grade=='s'){
            System.out.println(5.0);
        }else if(grade=='A'||grade=='a'){
            System.out.println(4.0);
        }else if(grade=='B'||grade=='b'){
            System.out.println(3.0);
        }else if(grade=='C'||grade=='c'){
            System.out.println(2.0);
        }else if(grade=='D'||grade=='d'){
            System.out.println(1.0);
        }else if(grade=='F'||grade=='f'){
            System.out.println("Fail");
        }else{
            System.out.println("Error: Please enter valid Grades");
        }
    }
}
