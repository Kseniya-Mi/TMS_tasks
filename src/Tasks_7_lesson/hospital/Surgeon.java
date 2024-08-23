package Tasks_7_lesson.hospital;

public class Surgeon extends Hospital {

    Surgeon(){};

    Surgeon(String doctor) {
        super(doctor);
    }

    @Override
    void treat() {
        System.out.println("I treat injuries");
    }
}
