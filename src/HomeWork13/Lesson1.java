package HomeWork13;
import java.util.Scanner;
class WrongLoginException extends Exception {
    public WrongLoginException() { super(); }
    public WrongLoginException(String message) { super(message); }
}
class WrongPasswordException extends Exception {
    public WrongPasswordException() { super(); }
    public WrongPasswordException(String message) { super(message); }
}
public class Lesson1 {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Введите логин: ");
        String login = scan.nextLine();
        System.out.print("Введите пароль: ");
        String password = scan.nextLine();
        System.out.print("Подтвердите пароль: ");
        String confirm = scan.nextLine();
        boolean isValid = checkCredentials(login, password, confirm);
        System.out.println("Результат проверки: " + isValid);
    }

    public static boolean checkCredentials(String login, String password, String confirmPassword) {
        try {
            if (login.length() >= 20 || login.contains(" "))
                throw new WrongLoginException("Неизвестные символы или вы ввели больше 20 символов!");

            if (password.length() >= 20 || password.contains(" "))
                throw new WrongPasswordException("Ошибка!");
            boolean hasDigit = false;
            for (int i = 0; i < password.length(); i++) {
                if (Character.isDigit(password.charAt(i))) {
                    hasDigit = true;
                    break;
                }
            }
            if (!hasDigit) {
                throw new WrongPasswordException("Пароль должен содержать хотя бы одну цифру!");
            }
            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Пароли не совпадают!");
            }
            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            System.err.println("Ошибка, не прошло проверку!: " + e.getMessage());
            return false;
        }
    }
}