package Tasks_8_lesson;

public class Tiger extends Animal{
    Tiger(String name) {
        super(name);
    }

    @Override
    void voice() {
        System.out.println("Rrr-rrr-rrr");
    }

    @Override
    void eat(String food) {
        if(food.equals("Meat"))
            System.out.println("Yummy!");
        else
            System.out.println("No! I'm not eat that...");
    }
}
