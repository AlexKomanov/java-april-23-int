package lesson_04.conditions.classTasks;

import java.util.Scanner;

public class IfElseTask {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int userNumber = input.nextInt();

        if (userNumber == 0) {
            System.out.println("A number is zero");
        } else if (userNumber % 2 == 0) {
            System.out.println("A number " + userNumber + " is even");
        } else {
            System.out.println("A number " + userNumber + " is odd");
        }
    }
}
