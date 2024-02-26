package lesson_05.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BasicArrayList {
    public static void main(String[] args) {

        int numbers[] = {5, 10, 15};
        System.out.println(Arrays.toString(numbers));

        ArrayList<Integer> listOfNumbers = new ArrayList<>(); // int -> primitive type
        listOfNumbers.add(5);
        listOfNumbers.add(10);
        listOfNumbers.add(15);
        System.out.println("listOfNumbers = " + listOfNumbers);
        System.out.println("listOfNumbers.size() = " + listOfNumbers.size());
        System.out.println("listOfNumbers.toArray() = " + Arrays.toString(listOfNumbers.toArray()));

        List<String> listOfNames = new ArrayList<>();
        System.out.println("listOfNames = " + listOfNames);
        System.out.println("listOfNames.size() = " + listOfNames.size());
        listOfNames.add("Alex");
        listOfNames.add("Neta");
        listOfNames.add("Name");
        System.out.println("listOfNames = " + listOfNames);
        System.out.println("listOfNames.size() = " + listOfNames.size());
    }
}
