package lesson_04.conditions;

public class OperatorIf {
    public static void main(String[] args) {

        int age = 17;

        System.out.println(age >= 18);

        if (age >= 18) {
            System.out.println("You're at least 18!");
            System.out.println("You can enter!");
            System.out.println("Welcome!");
        }

        System.out.println("After IF block...");
    }
}
