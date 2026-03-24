package Lesson8;

import java.util.Scanner;
import java.lang.reflect.Field;
public class HomeWork8 {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.println("Выбери блок");
            System.out.println("1 - 1 Блок");
            System.out.println("2 - Блок со звездой!");
            System.out.print("Ответ: ");
            int start = scanner.nextInt();

            if(start == 1)
                TaskOne.run();
            else if (start == 2)
                TaskTwo.run();
            else
                System.out.println("Введи доступное число!\n");
        }
    }
    public static  class TaskOne {
        public static void run() {
            System.out.println("Ок блок 1");
            Patient mikitos = new Patient();
            System.out.println("Напиши какой будет его план лечения (1, 2, 3??) !");
            mikitos.protect = scanner.nextInt();
            Therapist glavVra4 = new Therapist();
            glavVra4.prinimay(mikitos);
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
    }

    public static class TaskTwo {
        public static void run() {
            System.out.println("Ок сложный блок ((");
            try {
                Apple ogryzak = new Apple();
                System.out.println("Цвет сейчас: " + ogryzak.color);
                Field poleColor = Apple.class.getDeclaredField("color");
                poleColor.setAccessible(true);
                poleColor.set(ogryzak, "Зелёный \n");
                System.out.println("Цвет теперь: " + ogryzak.color);
            } catch (Exception e) {
                System.out.println("Ошибка!");
            }
        }
        static class Apple {
            private String color = "Чёрный";
        }
    }
}
