package lesson_04.conditions;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = input.nextInt();

//        String message = "";
//        if (age > 18){
//            message = "More than 18";
//        }
//        else {
//            message = "Under 18";
//        }
        String message = (age > 18) ? "More than 18" : "Under 18";


        System.out.println("message = " + message);


    }
}
