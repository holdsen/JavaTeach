package HomeWork12;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork12 {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Добро пожаловать!");
        System.out.println("1 задание");
        homeWork1();
    }
    public static void homeWork1() {
        while (true) {
            System.out.println("Введи аббревиатуру!");
            String input = scan.nextLine();
            if (input.length() >= 2 && input.length() <= 6) {
                boolean result = input.matches("[А-ЯA-Z]+");
                if (result) {
                    System.out.println("Аббривиатуры: " + input);
                    question1();
                } else {
                    System.out.println("Не допустимые символы!");
                }
            } else {
                System.out.println("Попробуй ещё, пиши только аббревиатуры от 2 до 6 символов!");
            }
        }
    }
    public static void question1() {
        System.out.println("Отлично продолжаем? (Да, Не, Другое(Домашнее задание со звёздочкой))");
            String answer = scan.nextLine();
            String yes = "Да";
            String no = "Не";
            String other = "Другое";
            if (answer.equalsIgnoreCase(yes)) {
                homeWork1();
            } else if (answer.equalsIgnoreCase(no)) {
                System.out.println("Ну тогда бб");
            } else if (answer.equalsIgnoreCase(other)) {
                System.out.println("Ок!");
                homeWork2();
            } else {
                System.out.println("Ну если не умеешь общаться бб!");
            }
    }
    public static void homeWork2() {
        String input = scan.nextLine();
        String docRegex = "\\b\\d{4}-\\d{4}-\\d{2}\\b";
        String phoneRegex = "\\+\\(\\d{2}\\)\\d{7}";
        String emailRegex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}";
        System.out.println("Результаты поиска");
        findAndPrint(input, docRegex, "document number");
        findAndPrint(input, emailRegex, "email");
        findAndPrint(input, phoneRegex, "phone number");
    }
    private static void findAndPrint(String text, String regex, String label) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        boolean found = false;
        while (matcher.find()) {
            System.out.println(label + ": " + matcher.group());
            found = true;
        }
        if (!found) {
            System.out.println(label + ": Данные не найдены");
        }
    }
}