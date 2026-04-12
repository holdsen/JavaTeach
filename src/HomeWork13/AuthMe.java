package HomeWork13;

public class AuthMe {
    public static boolean checkCredentials(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {

        // Проверка логина
        if (login.length() >= 20 || login.contains(" ")) {
            throw new WrongLoginException("Логин должен быть меньше 20 символов и без пробелов!");
        }


        if (password.length() >= 20 || password.contains(" ") || !password.matches(".*\\d.*")) {
            throw new WrongPasswordException("Пароль должен быть < 20 симв., без пробелов и с цифрой!");
        }

        // Сравнение паролей
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают!");
        }

        return true;
    }
}
