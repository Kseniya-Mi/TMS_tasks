package Tasks_15_lesson.task2;

public class Main {
    public static void main(String[] args) {
        Animals animals = new Animals();

        animals.addAnimal("Lion");
        animals.addAnimal("Tiger");
        animals.addAnimal("Rabbit");
        animals.addAnimal("Giraph");

        System.out.println();
        animals.getInfo();

        animals.removeAnimal();

        System.out.println();
        animals.getInfo();

        animals.addAnimal("Rat");

        System.out.println();
        animals.getInfo();

    }
}
