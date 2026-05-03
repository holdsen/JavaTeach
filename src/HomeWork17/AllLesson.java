package HomeWork17;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

/**
 * Домашнее задание №17
 * Данный класс содержит комплексное решение задач по теме Data API.
 * Основные темы:
 *   - Data/Time API
 *   - Функциональное интерфейсы
 *   - Лямбда выражения
 * @author Arsen Shaternik ★
 * @author inspector Nikita Shaternik ★
 * @version FIXED
 * @see java.util.Date
 * @since 29.04.2026
 * Дата и её свойства
 * Чтобы скипнуть дз /skip
 * /skip - Работает только в первой задании, так сделано чтобы было удобно!
 **/
public class AllLesson {
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String PURPLE = "\u001B[35m";
    public static final String BLUE = "\u001B[34m";
    public static final String AQUA = "\u001B[36m";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LocalDate birthday;
        while (true) {
            System.out.println(PURPLE + "Введите дату своего рождения: " + RESET);
            String happyBirthday = scan.nextLine();
            if (happyBirthday.equalsIgnoreCase("/Skip")) {
                Help();
                return;
            }
            try {
                birthday = LocalDate.parse(happyBirthday);
                break;
            } catch (DateTimeParseException e) {
                System.out.println(RED + "Ошибка!! Только цифры! Пример: 2000-01-01" + RESET);
            }
        }
        LocalDate date100 = birthday.plusYears(100);
        System.out.println(BLUE + "Дата принята!" + RESET);
        System.out.println(AQUA + "Дата через 100 лет: " + date100 + RESET);
        System.out.println("\n" + "\n" + "\n");
        LessonTwo();
    }

    public static void LessonTwo() {
        System.out.println(RED + "Домашнее задание #2" + RESET);
        Predicate<Integer> predicate = n -> n >= 0;
        int[] massive = {-2, -1, 0, 1, 2,};
        for (int n : massive) {
            if (predicate.test(n)) {
                System.out.println(n);
            }
        }
        LessonThree();
    }

    public static void LessonThree() {
        System.out.println(RED + "Домашнее задание #3" + RESET);
        Scanner scan = new Scanner(System.in);
        System.out.println("Какая у тебя сумма BYN?");
        try {
            int balance = scan.nextInt();
            Function<String, Double> money = s -> Double.parseDouble(s.split(" ")[0]) / 2.82;
            System.out.println("Переведение в доллары: " + money.apply(balance + " BYN") + "$");
            LessonFour();
        } catch (InputMismatchException e) {
            System.out.println("Ошибка! Пользователь ввёл строку!");
        }
    }

    public static void LessonFour() {
        System.out.println(RED + "Домашнее задание #4" + RESET);
        Scanner scan = new Scanner(System.in);
        System.out.println("Какая у тебя сумма BYN?");
        int balance = scan.nextInt();
        Consumer<String> money = n -> {
            double result = Double.parseDouble(n.split(" ")[0]) / 2.82;
            System.out.println("Результат: " + result + "$");
        };
        money.accept(balance + " BYN");
        LessonFive();
    }

    public static void LessonFive() {
        System.out.println(RED + "Домашнее задание #5" + RESET);
        Scanner scan = new Scanner(System.in);
        Supplier<String> text = () -> {
            System.out.println("Введите текст");
            String txt = scan.nextLine();
            return new StringBuilder(txt).reverse().toString();
        };
        System.out.println("Перевёртыш: " + text.get());
    }

    public static void Help() {
        Scanner help = new Scanner(System.in);
        System.out.println("Окей давай сделаем чуточку быстрее");
        System.out.println("Напиши какой ты дз хочешь увидеть(2-5)");
        if (help.hasNextInt()) {
            int chose = help.nextInt();
            if (chose == 2) LessonTwo();
            else if (chose == 3) LessonThree();
            else if (chose == 4) LessonFour();
            else if (chose == 5) LessonFive();
        }
    }
}
