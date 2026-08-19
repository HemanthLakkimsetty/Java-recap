import java.util.Scanner;

public class Q27PasswordCheck {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String password=sc.next();
        int score=0;
        if(password.length()>=8) score++;
        if(password.length()>=12) score++;
        if(password.matches(".*[A-Z].*")) score++;
        if(password.matches(".*[a-z].*")) score++;
        if(password.matches(".*//d.*")) score++;
        if(password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) score++;

        if(score<=2){
            System.out.println("Low level");
        }else if(score>=2 && score<=4){
            System.out.println("Mid level");
        }else{
            System.out.println("High level");
        }

    }
}
