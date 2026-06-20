package Lesson9;
import java.util.Scanner;
public class HomeWork9 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Добро пожаловать!");
            System.out.println("Выбери урок");
            System.out.println("1 - 1 Блок");
            System.out.println("2 - Блок со звёздочкой");
            System.out.print("Ты выбираешь: ");
            byte start = scanner.nextByte();
            if (start == 1)
                LessonOne.run();
            else if (start == 2)
                LessonTwo.run();
            else
                System.out.println("Пиши число которое дают тебе!");
        }
    }
    public class LessonOne {
        public static void run() {
            System.out.println("Каких из животных ты выберешь");
            System.out.println("1 - Собаку");
            System.out.println("2 - Тигр");
            System.out.println("3 - Кролик");
            System.out.print("Ты выбираешь: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 3) {
                Rabbit rabbit = new Rabbit();
                System.out.println("Что ты дашь кролику? (Мясо или Трава) пиши так как и написано(не траву а Трава)!!");
                String food = scanner.nextLine();
                rabbit.voice();
                rabbit.eat(food);
            } else if (choice == 1) {
                DogLessonOne dog = new DogLessonOne();
                System.out.println("Что ты дашь бедной собачке? (Мясо или Трава) пиши так как и написано(не траву а Трава)!!");
                String food = scanner.nextLine();
                dog.voice();
                dog.eat(food);
            } else if (choice == 2) {
                Tiger tiger = new Tiger();
                System.out.println("Что ты дашь бедному голодному тигрёнку? (Мясо или Трава) пиши так как и написано(не траву а Трава)!!");
                String food = scanner.nextLine();
                tiger.voice();
                tiger.eat(food);
            }
        }
    }
    public static class LessonTwo {
        public static void run() {
            System.out.println("----Блок со звёздочкой----");
            System.out.println("Кого ты любишь из животных?");
            System.out.println("1 - Собаку(нила)");
            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 1) {
                Dog secretDog = Dog.createDog();
                System.out.print("Что дадим Нилику? ");
                String food = scanner.nextLine();
                secretDog.voice();
                secretDog.eat(food);
            }
        }
    }
}
