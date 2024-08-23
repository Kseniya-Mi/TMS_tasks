package Tasks_8_lesson;

public class Dog extends Animal{
    Dog(String name) {
        super(name);
    }

    @Override
    void voice() {
        System.out.println("Gaf-gaf-gaf");
    }

    @Override
    void eat(String food) {
        if(food.equals("Meat"))
            System.out.println("Yummy!");
        else
            System.out.println("No! I'm not eat that...");
    }
}
