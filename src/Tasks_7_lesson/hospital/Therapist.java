package Tasks_7_lesson.hospital;

public class Therapist extends Doctor {

    Therapist() {}

    @Override
    void treat() {
        System.out.println("I prescribe treatment");
    }

    void setDoctor(int IDTreat){
        switch (IDTreat) {
            case 1 -> Patient.doctor = "Surgeon";
            case 2 -> Patient.doctor = "Dentist";
            default -> Patient.doctor = "Therapist";
        }
    }
}
