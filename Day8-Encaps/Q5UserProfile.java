package Encaps;

import java.util.Scanner;

public class Q5UserProfile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        UserProfile u = new UserProfile();

        String username = sc.next();
        String password = sc.next();

        u.setUsername(username);
        u.setPassword(password);

        if (u.getPassword() != null) {
            System.out.println("User Profile Created Successfully");
        }
        sc.close();
    }
}

class UserProfile {
    private String username;
    private String password;

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        if (password.length() >= 8) {
            this.password = password;
        } else {
            System.out.println("Error: Password must be at least 8 characters");
        }
    }

    public String getPassword() {
        return password;
    }
}