package Tasks_15_lesson.task2;

import java.util.LinkedList;

public class Animals {
    private LinkedList<String> animals;

    Animals(){
        this.animals = new LinkedList<>();
    }

    public void addAnimal(String animal) {
        animals.addFirst(animal);
    }

    public String removeAnimal() {
        if (animals.isEmpty()) {
            return null;
        }
        return animals.removeLast();
    }

    public void getInfo() {
        System.out.println("Animals in the collection:");
        for (String animal : animals) {
            System.out.println(animal);
        }
    }
}
