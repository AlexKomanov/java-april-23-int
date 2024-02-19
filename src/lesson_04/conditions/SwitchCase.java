package lesson_04.conditions;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is your experience? ");
        int experience = input.nextInt();

        double salary = 10000;

//        if (experience == 3) {
//            salary += 3000;
//        }
//        else if (experience == 2) {
//            salary += 2000;
//        }
//        else if (experience == 5) {
//            salary += 5000;
//        }
//        else if (experience == 4) {
//            salary += 4000;
//        }
//        else {
//            System.out.println("Not valid number...");
//        }
//        System.out.println("salary = " + salary);

        switch (experience) {
            case 3:
                salary += 3000;
                break;
            case 2:
                salary += 2000;
                break;
            case 5:
//                salary += 5000;
//                break;
            case 4:
                salary += 10000;
                break;
            default:
                System.out.println("Not valid number...");
                break;
        }

        System.out.println("salary = " + salary);


    }
}
