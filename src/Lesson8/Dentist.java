package Lesson8;

public class Dentist extends HomeWork8.TaskOne.Doctor {
    @Override
    public void heal() {
        System.out.println("Лечу зубы!");
        System.out.println("\n");
    }
        public void prinimay(HomeWork8.TaskOne.Patient patient) {
            if (patient.protect == 1)
                patient.doctor = new Surgeon();
            else if (patient.protect == 2)
                patient.doctor = new Dentist();
            else
                patient.doctor = new Therapist();

            patient.doctor.heal();
        }
    }
