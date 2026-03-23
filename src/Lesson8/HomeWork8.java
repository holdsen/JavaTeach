package Lesson8;

import java.util.Scanner;
import java.util.Map;
import java.lang.reflect.Field;
public class HomeWork8 {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.println("Выбери блок");
            System.out.println("1 - 1 Блок");
            System.out.println("2 - Блок со звездой!");
            System.out.print("Ответ: ");
            Map<Integer, Runnable> tasks = Map.of(1, TaskOne::run, 2, TaskTwo::run);
            tasks.getOrDefault(scanner.nextInt(), () -> {
                System.out.println("Введи нормальное число");
                System.exit(0);
            }).run();
        }
    }
    public static  class TaskOne {
        public static void run() {
            System.out.println("Ок блок 1");
            Patient Mikitosik = new Patient();
            System.out.println("Напиши какой будет его план лечения (1, 2, 3??) !");
            Mikitosik.protect = scanner.nextInt();
            Therapist glavVra4 = new Therapist();
            glavVra4.prinimay(Mikitosik);
            }
        static class Doctor {
            public void heal() {
                System.out.println("Врач начал лечение!");
            }
        }
        static class Patient {
            public int protect;
            Doctor doctor;
        }
        static class Surgeon extends Doctor {
            @Override
            public void heal() {
                System.out.println("Оперирую!");
                System.out.println("\n");
            }
        }
        static class Therapist extends Doctor {
            @Override
            public void heal() {
                System.out.println("Провожу осмотр");
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
        static class Dentist extends Doctor {
            @Override
            public void heal() {
                System.out.println("Летаю зубы!"); //:DD
                System.out.println("\n");
            }
        }
    }
    public static class TaskTwo {
        public static void run() {
            System.out.println("Ок сложный блок ((");
            try {
                Apple ogryzak = new Apple();
                System.out.println("Цвет сейчас: " + ogryzak.color);
                Field poleColor = Apple.class.getDeclaredField("color");
                poleColor.setAccessible(true);
                poleColor.set(ogryzak, "Зилиный) \n");
                System.out.println("Цвет теперь: " + ogryzak.color);
            } catch (Exception e) {
                System.out.println("ТЫ лох");
            }
        }
        static class Apple {
            private String color = "ЧИРНЫЙ НИГРР";
        }
    }
}
