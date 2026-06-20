package lesson4;
/**
 * Author Shaternik Arsen
 * Made by Shaternik Mikita Miroslavovich
 */


import java.util.Arrays;
import java.util.Scanner;


public class HomeWorkLesson5 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Привет Мачо Выбирай урок");
            System.out.println("1 - Урок первый");
            System.out.println("2 - Урок второй");
            System.out.println("3 - Урок со звёздочкой *");
            System.out.println("Твой ответ: ");

            int start = scanner.nextInt();

            switch (start) {
                case 1 -> LessonOne.run();
                case 2 -> LessonTwo.run();
                case 3 -> LessonThree.run();
            }
        }
    }

    /**
     * Задача 1:
     * 1.1 Создать двумерный массив, заполнить его случайными числами.
     * 1.2 Добавить к каждому значению число, которое пользователь будет вводить с консоли.
     * 1.3 Найти сумму всех получившихся элементов и вывести в консоль.
     */

    public static class LessonOne {
        public static void run() {
                System.out.println("Ты выбрал урок 1");
                System.out.println("Создаём....");
                int[][] massive = new int[4][5];
                for (int i = 0; i < massive.length; i++) {
                    for (int j = 0; j < massive[i].length; j++) {
                        massive[i][j] = (int) (Math.random() * 100) + 1;
                    }
                }
                System.out.println("Рандомные числа: " + Arrays.deepToString(massive));
                System.out.println("Теперь добавь значение: ");
                int meaning = scanner.nextInt();

                for (int i = 0; i < massive.length; i++) {
                    for (int j = 0; j < massive[i].length; j++) {
                        massive[i][j] = massive[i][j] + meaning;
                    }
                }
                System.out.println("Добавление: " + Arrays.deepToString(massive));
                int summa = 0;
                for (int i = 0; i < massive.length; i++) {
                    for (int j = 0; j < massive[i].length; j++) {
                        summa += massive[i][j];
                    }
                }
                System.out.println("Сумма всех элементов: " + summa);
        }
    }

    /** Создать программу для раскраски шахматной доски с помощью цикла. Создать
     *     двумерный массив String 8х8. С помощью циклов задать элементам массива значения
     *     B(Black) или W(White). При выводе результат работы программы должен быть
     *     следующим:
     *     W B W B W B W B
     *     B W B W B W B W
     *     W B W B W B W B
     *     B W B W B W B W
     *     W B W B W B W B
     *     B W B W B W B W
     *     W B W B W B W B
     *     B W B W B W B W
     */

    static class LessonTwo {
        public static void run() {
            System.out.println("Отлично ты выбрал урок 2");
            System.out.println("Создание....");
            String[][] board = new String[8][8];
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    if ((i + j) % 2 == 0) {
                        board[i][j] = "W";
                    } else {
                        board[i][j] = "B";
                    }
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    /**
     * Задача *:
     * Даны числа n и m. Создайте массив A[n][m] и заполните его змейкой (см. пример).
     * Формат входных данных:
     * Программа получает на вход два числа n и m.
     * Формат выходных данных:
     * Программа должна вывести полученный массив, отводя на вывод каждого числа ровно 3 символа.
     */

    static class LessonThree {
        public static void run() {
            System.out.println("Отлично ты выбрал урок со звёздочкой");
            System.out.println("Создание....");
            System.out.println("Напиши число n:");
            int n = scanner.nextInt();
            System.out.println("Напиши число m:");
            int m = scanner.nextInt();
            int[][] massive = new int[n][m];
            int impossible = 0;
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    for (int j = 0; j < m; j++) {
                        massive[i][j] = impossible++;
                    }
                } else {
                    for (int j = m - 1; j >= 0; j--) {
                        massive[i][j] = impossible++;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.printf("%3d", massive[i][j]);
                }
                System.out.println();
            }
        }
    }
}



