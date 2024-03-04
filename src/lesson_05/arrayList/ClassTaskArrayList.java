package lesson_05.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassTaskArrayList {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> arrayList = new ArrayList<>();
        int sum = 0;
        int temporary;
/*
        Optional Solution
        // Get three numbers from the user
        System.out.print("Enter number 1: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter number 2: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter number 3: ");
        int num3 = scanner.nextInt();
        arrayList.add(num1);
        arrayList.add(num2);
        arrayList.add(num3);

 */
        System.out.print("Enter number 1: ");
        temporary = scanner.nextInt();
        arrayList.add(temporary);
        sum += temporary;
        System.out.print("Enter number 2: ");
        temporary = scanner.nextInt();
        arrayList.add(temporary);
        sum += temporary;
        System.out.print("Enter number 3: ");
        temporary = scanner.nextInt();
        arrayList.add(temporary);
        sum += temporary;


        scanner.close();

        System.out.println("arrayList = " + arrayList);
        System.out.println("sum = " + sum);


        // Calculate minimum, maximum, and average using the numbers array
        int min = arrayList.get(0);
        int max = arrayList.get(0);


        if (arrayList.get(1) < min) {
            min = arrayList.get(1);
        }
        if (arrayList.get(2) < min) {
            min = arrayList.get(2);
        }

        if (arrayList.get(1) > max) {
            max = arrayList.get(1);
        }
        if (arrayList.get(2) > max) {
            max = arrayList.get(2);
        }

        double average = (double) sum / arrayList.size();

        // Print the results
        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);
        System.out.println("Average: " + average);
    }
}
