package lesson_04.logicalOperators;

import java.util.Scanner;

public class OperatorAnd {
    public static void main(String[] args) {
                        //   true && true
        System.out.println(5 > 4 && 6 > 5);

                        //   false && true
        System.out.println(5 < 4 && 6 > 5);

        //                 false && false
        System.out.println(5 < 4 && 6 < 5);

        //                 true && false
        System.out.println(5 > 4 && 6 < 5);

        String realUsername = "username";
        String realPassword = "Password";

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username: ");
        String actualUsername = input.nextLine();
        System.out.println("Enter your password: ");
        String actualPassword = input.nextLine();

        System.out.println(realPassword.equalsIgnoreCase(actualPassword) && realUsername.equalsIgnoreCase(actualUsername));

    }
}
