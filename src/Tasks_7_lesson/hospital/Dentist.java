package Tasks_7_lesson.hospital;

public class Dentist extends Hospital{

    Dentist(){};

    Dentist(String doctor) {
        super(doctor);
    }

    @Override
    void treat() {
        System.out.println("I treat teeth");
    }
}
