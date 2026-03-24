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
            mikitos.setProtect(scanner.nextInt());
            Therapist glavVra4 = new Therapist();
            glavVra4.prinimay(mikitos);
        }
    }
    public static class TaskTwo {
        public static void run() {
            System.out.println("Ок сложный блок ((");
            try {
                Apple ogryzak = new Apple();
                Field poleColor = Apple.class.getDeclaredField("color");
                poleColor.setAccessible(true);
                String colorBefore = (String) poleColor.get(ogryzak);
                System.out.println("Цвет сейчас: " + colorBefore);
                poleColor.set(ogryzak, "Зелёный");
                String colorAfter = (String) poleColor.get(ogryzak);
                System.out.println("Цвет теперь: " + colorAfter);

            } catch (Exception e) {
                System.out.println("Ошибка при взломе!");
                e.printStackTrace();
            }
        }
    }
}
