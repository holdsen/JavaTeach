package HomeWork15;

import java.util.LinkedList;
import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Animals animals = new Animals();
        while (true) {
            System.out.println("1. Добавить в начало");
            System.out.println("2. Удалить из конца");
            System.out.println("3. Показать всех");
            System.out.print("Выбери действие: ");
            String cmd = scan.nextLine();
            if (cmd.equals("1")) animals.addAnimal();
            else if (cmd.equals("2")) animals.killAnimal();
            else if (cmd.equals("3")) animals.showAnimals();
        }
    }
    static class Animals {
        LinkedList<String> list = new LinkedList<>();
        Scanner scan = new Scanner(System.in);
        public Animals() {
            list.add("Заяц");
            list.add("Лев");
            list.add("Волк");
        }
        public void killAnimal() {
            if (!list.isEmpty()) {
                String removed = list.removeLast();
                System.out.println("✅ " + removed + " удален из КОНЦА списка.");
            } else {
                System.out.println("Список пуст!");
            }
        }
        public void addAnimal() {
            System.out.print("Кого добавим в начало?: ");
            String name = scan.nextLine();
            list.addFirst(name);
            System.out.println("✅ " + name + " добавлен в НАЧАЛО.");
        }
        public void showAnimals() {
            System.out.println("Текущий список: " + list);
        }
    }
}

