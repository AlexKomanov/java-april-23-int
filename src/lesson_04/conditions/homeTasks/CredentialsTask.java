package lesson_04.conditions.homeTasks;

import java.util.Scanner;

public class CredentialsTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String actualUsername = "alex";
        String actualPassword = "alex1234";

        System.out.println("Please enter your username: ");
        String inputUsername = scanner.nextLine();
        System.out.println("Please enter your password: ");
        String inputPassword = scanner.nextLine();


        // Ternary Solution
        //   12fa678           23fe670
        // actualUsername == inputUsername
        String message = (actualUsername.equalsIgnoreCase(inputUsername) && actualPassword.equalsIgnoreCase(inputPassword))
                         ? "Welcome " + inputUsername.toLowerCase() + " to the system!"
                         : "The username or password is incorrect";

        System.out.println("message = " + message);


        // If-Else solution

    }
}
