package Lesson8;

public class Therapist extends Doctor {

    @Override
    public void heal() {
        System.out.println("Провожу осмотр!");
        System.out.println("\n");
    }


    public void prinimay(Patient patient) {
        if (patient.protect == 1)
            patient.doctor = new Surgeon();
        else if (patient.protect == 2)
            patient.doctor = new Dentist();
        else
            patient.doctor = new Therapist();

        patient.doctor.heal();
    }
}