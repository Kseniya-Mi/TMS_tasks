package Tasks_7_lesson.hospital;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        getHospital();
    }

    public static void getHospital(){
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome in the hospital! \nEnter code of your treating plan: ");
        Patient.plan = input.nextInt();

        Therapist doctor = new Therapist();
        doctor.setDoctor(Patient.plan);

        System.out.println("Your doctor is: " + Patient.doctor);

        switch(Patient.plan){
            case 1:
                Doctor doctor1 = new Surgeon();
                doctor1.treat();
                break;
            case 2:
                Doctor doctor2 = new Dentist();
                doctor2.treat();
                break;
            default:
                Doctor doctor3 = new Therapist();
                doctor3.treat();
                break;
        }
    }
}
