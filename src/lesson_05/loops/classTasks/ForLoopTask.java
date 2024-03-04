package lesson_05.loops.classTasks;

public class ForLoopTask {
    public static void main(String[] args) {

        int starter = 1000;
        for (int i = starter; i >= 0; i--) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
