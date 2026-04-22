package HomeWork15;

import java.util.LinkedList;
import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            Animals animals = new Animals(scan);
            boolean isRunning = true;
            while (isRunning) {
                System.out.println("\n1. Добавить" +
                        " \n2. Удалить " +
                        " \n3. Показать " + "\n0. Выход");
                System.out.print("Выбери действие: ");
                String cmd = scan.nextLine();
                switch (cmd) {
                    case "1" -> animals.addAnimal();
                    case "2" -> animals.killAnimal();
                    case "3" -> animals.showAnimals();
                    case "0" -> isRunning = false;
                    default -> System.out.println("Неверная команда");
                }
            }
        }
    }

}
