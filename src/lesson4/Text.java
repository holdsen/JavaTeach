package lesson4;

import java.util.Scanner;

class Text {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {  // Бесконечный цикл вместо метки
            System.out.print("Напиши здесь: ");

            // Проверяем, ввел ли пользователь число
            if (scanner.hasNextInt()) {
                int a = scanner.nextInt();

                switch (a) {
                    case 1 -> System.out.println("Тимур лох");
                    case 2 -> System.out.println("Тимур лох но не совсем");
                    case 3 -> System.out.println("Тимур имба");
                    default -> System.out.println("Отдаъ");
                }
            } else {
                System.out.println("Пожалуйста, введите число");
                scanner.next(); // Очищаем некорректный ввод
            }
        }
    }
}