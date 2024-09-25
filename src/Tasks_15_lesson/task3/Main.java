package Tasks_15_lesson.task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Students> students = new ArrayList<>();

        // Добавление студентов в коллекцию
        students.add(new Students("Alice", 1, 1, List.of(4, 3, 5)));
        students.add(new Students("Bob", 2, 2, List.of(2, 3, 2)));
        students.add(new Students("Charlie", 2, 3, List.of(4, 4, 4)));
        students.add(new Students("Mariya", 1, 2, List.of(4, 1, 5)));
        students.add(new Students("Petya", 1, 2, List.of(2, 3, 5)));
        students.add(new Students("Jack", 2, 1, List.of(4, 1, 4)));

        Students.printInfoStudents(students);
        System.out.println("________________________________________________________");

        Students.removeStudents(students);

        System.out.println("________________________________________________________");

        Students.printStudents(students, 2);

        System.out.println("________________________________________________________");
        Students.printInfoStudents(students);
    }
}
