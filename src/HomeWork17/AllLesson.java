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
 * @version FIXED 2.0
 * @see java.util.Date
 * @since 04.05.2026
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
        lessonOne();
        lessonTwo();
        lessonThree();
        lessonFour();
        lessonFive();
    }

    public static void lessonOne() {
        System.out.println(PURPLE + "Домашнее задание #1 (Data API)" + RESET);
        LocalDate birthday = LocalDate.of(2000, 1, 1);
        LocalDate date100 = birthday.plusYears(100);
        System.out.println(BLUE + "Дата рождения: " + birthday + RESET);
        System.out.println(AQUA + "Дата через 100 лет: " + date100 + RESET);
        System.out.println();
    }

    public static void lessonTwo() {
        System.out.println(RED + "Домашнее задание #2 (Predicate)" + RESET);
        Predicate<Integer> predicate = n -> n >= 0;
        int[] massive = {-2, -1, 0, 1, 2};
        for (int n : massive) {
            if (predicate.test(n)) {
                System.out.println(n);
            }
        }
        System.out.println();
    }

    public static void lessonThree() {
        System.out.println(RED + "Домашнее задание #3 (Function)" + RESET);
        double balance = 100.0;
        Function<String, Double> money = s -> Double.parseDouble(s.split(" ")[0]) / 2.82;
        System.out.println("BYN: " + balance + " -> USD: " + money.apply(balance + " BYN") + "$");
        System.out.println();
    }

    public static void lessonFour() {
        System.out.println(RED + "Домашнее задание #4 (Consumer)" + RESET);
        double balance = 250.0;
        Consumer<String> money = n -> {
            double result = Double.parseDouble(n.split(" ")[0]) / 2.82;
            System.out.println("Результат конвертации: " + result + "$");
        };
        money.accept(balance + " BYN");
        System.out.println();
    }

    public static void lessonFive() {
        System.out.println(RED + "Домашнее задание #5 (Supplier)" + RESET);
        String input = "Я не стар, брат сена я";
        Supplier<String> text = () -> new StringBuilder(input).reverse().toString();
        System.out.println("Исходная строка: " + input);
        System.out.println("Перевёртыш: " + text.get());
        System.out.println();
    }
}
