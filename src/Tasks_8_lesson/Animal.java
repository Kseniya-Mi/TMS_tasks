package Tasks_8_lesson;

public class Animal {
    private String name;

    Animal(String name){
        this.name = name;
    }

    void voice(){
        System.out.println("Silence....");
    }

    void eat(String food){
        System.out.println("Hungry....");
    }
}
