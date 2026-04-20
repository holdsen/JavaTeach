package HomeWork15;
import java.util.HashSet;
import java.util.Scanner;
public class Lesson1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("⬇Введи набор чисел⬇");
            String start = scan.nextLine();
            if(start.matches("[\\d\\s]+")) {
                HashSet<String> set = new HashSet<>();
                String[] words = start.split("[ ,\\s]+");
                for (String s : words) {
                    if (!s.isEmpty()) {
                        set.add(s);
                    }
                }
                System.out.println("Результат: " + set);
            } else {
                System.out.println("Ошибка!!: ВВедите только цифры!");
            }
        }
    }
}
