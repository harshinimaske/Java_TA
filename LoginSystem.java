import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        String user = "admin", pass = "1234";
        Scanner sc = new Scanner(System.in);

        System.out.print("Username: ");
        String u = sc.nextLine();
        System.out.print("Password: ");
        String p = sc.nextLine();

        if (u.equals(user) && p.equals(pass)) System.out.println("Login successful!");
        else System.out.println("Invalid credentials.");
    }
}