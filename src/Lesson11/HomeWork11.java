package Lesson11;

import java.util.Scanner;

public class HomeWork11 {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("Привет выбирай какой ты выбираешь урок:");
            System.out.println("Первый - 1");
            System.out.println("Дз со звёздочкой - 2");
            System.out.print("Твой выбор: ");
            int start = scan.nextInt();
            if (start == 1)
                taskOne();
            else if (start == 2)
                HomeWork2();
            else
                System.out.println("Введи доступное число!");
        }
    }


    public static void taskOne() {
        System.out.print("Окей напиши номер:");
        int number = scan.nextInt();
        scan.nextLine();
        if (number == 1) {
            System.out.println("Ок введи 3 строки");
            System.out.println("1 строка");
            String oneStrok = scan.nextLine();
            System.out.println("2 строка");
            String twoStrok = scan.nextLine();
            System.out.println("3 строка");
            String threeStrok = scan.nextLine();
            System.out.println("Вот что ты ввёл: " + "\n-----------------\n" + threeStrok + "\n" + twoStrok + "\n" + oneStrok + "\n--------------\n");
            System.out.println("В твоих 3 строк: ");
            System.out.print(oneStrok.length() + " ");
            System.out.print(twoStrok.length() + " ");
            System.out.print(threeStrok.length());

            String test = oneStrok;
            if (twoStrok.length() < test.length())
                test = twoStrok;

            if (threeStrok.length() < test.length())
                test = threeStrok;

            System.out.println("Самая короткая: " + test);
            if (twoStrok.length() > test.length())
                test = twoStrok;

            if (threeStrok.length() > test.length())
                test = threeStrok;

            System.out.println("Большая строка: " + test);
            System.out.println("\n");
        } else if (number == 2) {
            System.out.println("Ок разбираем");
            System.out.println("Но введи 3 строки");
            System.out.println("1 строка");
            String oneStrok = scan.nextLine();
            System.out.println("2 строка");
            String twoStrok = scan.nextLine();
            System.out.println("3 строка");
            String threeStrok = scan.nextLine();
            System.out.println("Вот что ты ввёл: " + "\n-----------------\n" + threeStrok + "\n" + twoStrok + "\n" + oneStrok + "\n--------------\n");
            System.out.println("В твоих 3 строк: ");
            System.out.print(oneStrok.length() + " ");
            System.out.print(twoStrok.length() + " ");
            System.out.print(threeStrok.length());
            if (oneStrok.length() > twoStrok.length()) {
                String test = oneStrok;
                oneStrok = twoStrok;
                twoStrok = test;
            }
            if (twoStrok.length() > threeStrok.length()) {
                String testTwo = twoStrok;
                twoStrok = threeStrok;
                threeStrok = testTwo;
            }
            if (oneStrok.length() > twoStrok.length()) {
                String test = oneStrok;
                oneStrok = twoStrok;
                twoStrok = test;
            }
            System.out.println("Ответ: \n" + oneStrok + "\n" + twoStrok + "\n" + threeStrok);
        } else if (number == 3) {
            System.out.println("Ок делаем");
            System.out.println("Но введи 3 строки");
            System.out.println("1 строка");
            String oneStrok = scan.nextLine();
            System.out.println("2 строка");
            String twoStrok = scan.nextLine();
            System.out.println("3 строка");
            String threeStrok = scan.nextLine();
            System.out.println("Вот что ты ввёл: " + "\n-----------------\n" + threeStrok + "\n" + twoStrok + "\n" + oneStrok + "\n--------------\n");
            System.out.println("В твоих 3 строк: ");
            System.out.print(oneStrok.length() + " ");
            System.out.print(twoStrok.length() + " ");
            System.out.println(threeStrok.length());
            int average = (oneStrok.length() + twoStrok.length() + threeStrok.length()) / 3;
            if (oneStrok.length() < average) {
                System.out.println("Строка меньше средней: " + oneStrok + " (длина: " + oneStrok.length() + ")");
            }
            if (twoStrok.length() < average) {
                System.out.println("Строка меньше средней: " + twoStrok + " (длина: " + twoStrok.length() + ")");
            }
            if (threeStrok.length() < average) {
                System.out.println("Строка меньше средней: " + threeStrok + " (длина: " + threeStrok.length() + ")");
            }
            System.out.println("\n");
        } else if (number == 4) {
            System.out.println("4 так четыре");
            System.out.println("Но введи 3 строки");
            System.out.println("1 строка");
            String oneStrok = scan.nextLine();
            System.out.println("2 строка");
            String twoStrok = scan.nextLine();
            System.out.println("3 строка");
            String threeStrok = scan.nextLine();
            System.out.println("вот что ты ввёл: " + "\n-----------------\n" + threeStrok + "\n" + twoStrok + "\n" + oneStrok + "\n--------------\n");
            System.out.println("В твоих 3 строк: ");
            System.out.print(oneStrok.length() + " ");
            System.out.print(twoStrok.length() + " ");
            System.out.println(threeStrok.length());
            String[] strings = {oneStrok, twoStrok, threeStrok};
            boolean found = false;
            for (String line : strings) {
                if (found) break;
                String[] words = line.split(" ");
                for (String word : words) {
                    if (word.isEmpty()) continue;
                    if (Chars(word)) {
                        System.out.println("Слово: " + word);
                        found = true;
                        break;
                    }
                }
            }
            if (!found) {
                System.out.println("Слова только из символов!");
            }
        } else if (number == 5) {
            System.out.println("Введи 1 строку");
            String oneStrok = scan.nextLine();
            System.out.println("вот что ты ввёл: " + "\n-----------------\n" + oneStrok + "\n--------------\n");
            System.out.println("В твоих 3 строк: ");
            System.out.print(oneStrok.length() + " ");
            String result = "";
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < oneStrok.length(); i++) {
                char c = oneStrok.charAt(i);
                sb.append(c);
                sb.append(c);
            }
            System.out.println("Вывод: " + sb.toString());
        }
    }

    public static boolean Chars(String word) {
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void HomeWork2() {
            System.out.println("Ок задача со звёздочкой");
            scan.nextLine();
            System.out.println("Введите строку с несколькими словами:");
            String input = scan.nextLine();
            System.out.println("Какое слово проверить? Напиши число! ");
            if (!scan.hasNextInt()) {
                scan.nextInt();
                System.out.println("Ошибка: нужно было ввести число!");
                return;
            }
            int targetIndex = scan.nextInt();
            String[] words = input.split("\\s+"); /**Как я понял регулятор*/
            if (targetIndex <= 0)
                System.out.println("Ошибка: Номер слова должен быть больше 0!");
            else if (targetIndex > words.length)
                System.out.println("Ошибка: В строке всего " + words.length + " слов(а), а ты выбрал " + targetIndex);
            else {
                String wordToCheck = words[targetIndex - 1];
                if (isPalindrome(wordToCheck))
                    System.out.println("Слово '" + wordToCheck + "' — это палиндром! Красава.");
                else
                    System.out.println("Слово '" + wordToCheck + "' — не палиндром.");
            }
        }

        public static boolean isPalindrome(String word) {
            String cleanWord = word.toLowerCase();
            String reversedWord = new StringBuilder(cleanWord).reverse().toString();
            return cleanWord.equals(reversedWord);
        }
    }

