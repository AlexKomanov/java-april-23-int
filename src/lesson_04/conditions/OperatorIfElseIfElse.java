package lesson_04.conditions;

import java.util.Scanner;

public class OperatorIfElseIfElse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();

        // 17 | 18-30 | 31 - 50 | 51 - 100

        if (age >= 0 && age < 18) {
            System.out.println("Under 18");
        }
        else if (age >= 18 && age <= 30){
            System.out.println("range of 18-30");
        }
        else if (age >= 31 && age <= 50){
            System.out.println("range of 31-50");
        }
        else if (age >= 51 && age <= 100){
            System.out.println("range of 51-100");
        }
        else {
            System.out.println("Not valid age. Please try again...");
        }

    }
}
