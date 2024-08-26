package Tasks_7_lesson.hospital;

public class Dentist extends Doctor{

    Dentist(){};

    Dentist(String name) {
        super(name);
    }

    @Override
    void treat() {
        System.out.println("I treat teeth");
    }
}
