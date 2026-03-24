package Lesson8;



public class Dentist extends Doctor {
    @Override
    public void heal() {
        System.out.println("Лечу зубы!");
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
