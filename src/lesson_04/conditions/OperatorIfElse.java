package lesson_04.conditions;

public class OperatorIfElse {
    public static void main(String[] args) {

        int age = 17;

        System.out.println(age >= 18);

        if (age >= 18) {
            System.out.println("You're at least 18!");
            System.out.println("You can enter!");
            System.out.println("Welcome!");
        }
        else {
            System.out.println("You're under the age...");
            System.out.println("Try next year...");
        }

        System.out.println("After IF ELSE blocks...");
    }
}
