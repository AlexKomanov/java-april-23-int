package lesson_05.arrayList;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        System.out.println("arrayList.size() = " + arrayList.size());

        arrayList.add(5);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(1000);

        System.out.println("arrayList.size() = " + arrayList.size());

        System.out.println("arrayList = " + arrayList);

        // array[2] = 100
        arrayList.set(2, 100);

        System.out.println("arrayList = " + arrayList);

        // array[2]
        System.out.println("arrayList.get(2) = " + arrayList.get(2));
        System.out.println("arrayList.get(3) = " + arrayList.get(3));
        if (arrayList.size() >= 10) {
            System.out.println("arrayList.get(10) = " + arrayList.get(10));
        }
        else {
            System.out.println("Out of bounds...");
        }

        System.out.println("arrayList.indexOf(5) = " + arrayList.indexOf(5));
        System.out.println("arrayList.indexOf(200) = " + arrayList.indexOf(200));

        System.out.println("arrayList.contains(5) = " + arrayList.contains(5));
        System.out.println("arrayList.contains(200) = " + arrayList.contains(200));

        arrayList.remove(3);
        arrayList.remove(arrayList.size() - 1);
        arrayList.remove(arrayList.get(0));
        System.out.println("arrayList = " + arrayList);

    }
}
