package HomeWork13;

public class Lesson2 {
    public static void main(String[] args) {
        try {
            System.out.println("Тест");
            System.exit(0);
        } catch (Exception e) {
            System.out.println("Пример: не выполнен");
        } finally {
            System.out.println("Если ты это видешь в консоле значит задача сделана не верна!");
        }
    }
}