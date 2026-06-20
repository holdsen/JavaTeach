package HomeWork15;

import java.util.LinkedList;
import java.util.Scanner;

class Animals extends Lesson2 {
    LinkedList<String> list = new LinkedList<>();
    Scanner scan;
    public Animals(Scanner scan) {
        this.scan = scan;
        list.add("Заяц");
        list.add("Лев");
        list.add("Волк");
    }
    public void killAnimal() {
        if (!list.isEmpty()) {
            System.out.println("✅ " + list.removeLast() + " удален.");
        } else {
            System.out.println("Список пуст!");
        }
    }

    public void addAnimal() {
        System.out.print("Кого добавим в начало?: ");
        String name = scan.nextLine();
        list.addFirst(name);
        System.out.println("✅ " + name + " добавлен.");
    }
    public void showAnimals() {
        System.out.println("Текущий список: " + list);
    }
}

