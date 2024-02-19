package lesson_04.conditions.classTasks;

import java.util.Scanner;

public class DaysTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your day (1-7)? ");

        int numberOfDay = scanner.nextInt();

        switch (numberOfDay) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
//                System.out.println("Friday");
//                break;
            case 7:
                System.out.println("Weekend!");
                break;
            default:
                System.out.println("Not a valid number...");
        }

    }
}
