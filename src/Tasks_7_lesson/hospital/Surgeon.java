package Tasks_7_lesson.hospital;

public class Surgeon extends Doctor {

    Surgeon(){};

    Surgeon(String name) {
        super(name);
    }

    @Override
    void treat() {
        System.out.println("I treat injuries");
    }
}
