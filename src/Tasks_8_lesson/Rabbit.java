package Tasks_8_lesson;

public class Rabbit extends Animal{
    Rabbit(String name) {
        super(name);
    }

    @Override
    void voice() {
        System.out.println("Oink-oink-oink");
    }

    @Override
    void eat(String food) {
        if(food.equals("Grass"))
            System.out.println("Yummy!");
        else
            System.out.println("No! I'm not eat that...");
    }
}
