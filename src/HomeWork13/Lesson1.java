package HomeWork13;
import java.util.Scanner;

public class Lesson1 {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите логин: ");
        String login = scan.nextLine();
        System.out.print("Введите пароль: ");
        String password = scan.nextLine();
        System.out.print("Подтвердите пароль: ");
        String confirm = scan.nextLine();

        try {
            boolean isValid = AuthMe.checkCredentials(login, password, confirm);
            System.out.println("Результат проверки: " + isValid);
            System.out.println("Вы зарегистрировались!");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.err.println("Ошибка регистрации: " + e.getMessage());
            System.out.println("Результат проверки: false");
        }
    }
}