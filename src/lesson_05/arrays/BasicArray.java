package lesson_05.arrays;

import java.util.Arrays;

public class BasicArray {
    public static void main(String[] args) {

        String name = "Alex";
        String name1 = "Neta";
        String name2 = "David";

        String names[] = new String[4];
        System.out.println(names.length); // array length - 1
        System.out.println("names = " + Arrays.toString(names));
        System.out.println(names[0]);
        names[0] = "Alex";
        names[1] = "Neta";
        names[2] = "David";
        names[3] = "";
        System.out.println("names = " + Arrays.toString(names));
        System.out.println("names[3] = " + names[3]);
        //            0      1        2
        // names = ["Alex", "Neta", "David"]
        System.out.println(names[0]);


        int myNumbers[] = {2, 5, 10, 45, 70};
        System.out.println(myNumbers.length);
        System.out.println("myNumbers = " + Arrays.toString(myNumbers));
        int numbers[] = new int[2];
        System.out.println("numbers[0] = " + numbers[0]);
        numbers[0] = 15;
        System.out.println("numbers[0] = " + numbers[0]);

        // int numbers[] = new int[2];   ---> [0 , 0]
        // String names[] = new String[3]; ------> [null, null, null]




    }
}
