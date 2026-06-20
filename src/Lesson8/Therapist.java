package Lesson8;

public class Therapist extends Doctor {

    @Override
    public void heal() {
        System.out.println("Провожу осмотр!");
        System.out.println("\n");
    }


    public void prinimay(Patient patient) {
        int plan = patient.getProtect();
        if (plan == 1)
            patient.setDoctor(new Surgeon());
        else if (plan == 2)
            patient.setDoctor(new Dentist());
        else
            patient.setDoctor(new Therapist());

        patient.getDoctor().heal();
    }
}