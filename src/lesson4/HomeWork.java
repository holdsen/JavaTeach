package lesson4;
/**
 * Author: Arseniy Shaterik
 * Made for Nikita Shaterik
 * Homework #4
 * I hope you like everything
 */
import java.awt.image.AreaAveragingScaleFilter;
import java.lang.runtime.SwitchBootstraps;
import java.util.AbstractCollection;
import java.util.Scanner;
import java.util.Arrays;

public class HomeWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        menu:
        while (true) {
            printDash("Выбери урок на выбор:");
            System.out.println("1 - Первый урок");
            System.out.println("2 - Второй урок");
            System.out.println("3 - третий урок");
            System.out.println("4 - четвёртый урок");
            System.out.println("5 - пятый урок");
            System.out.println("6 - шестой урок");
            System.out.println("7 - Урок со звёздочкой");
            printWrite("\nПиши Здесь: ");
            int start = scanner.nextInt();


            switch (start) {
                case 7 -> LessonSeven.run();
                case 6 -> LessonSix.run();
                case 5 -> LessonFive.run();
                case 4 -> LessonFour.run();
                case 3 -> LessonThree.run();

                case 2 -> LessonTwo.run();
                case 1 -> LessonOne.run();
                default -> {
                    printDash("Ты ввел недопустимый символ,");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }

            }
        }
    }

    public static void printDash(String message) {
        System.out.println("----------------------------------------");
        System.out.println(message);
        System.out.println("----------------------------------------");
    }

    public static void printWrite(String message) {
        System.out.println("----------------------------------------");
        System.out.print(message);
    }




    /*Задача 1:
Пройти по массиву, вывести все элементы в прямом и в обратном порядке.*/

    static class LessonOne {
        public static void run() {
            Scanner scanner = new Scanner(System.in);

            boolean DontStoping = true;
            while (DontStoping) {
                System.out.println("↓ Напишите какой способ вам удобен ↓");
                System.out.println("1 - Рандом");
                System.out.println("2 - Выбрать самому");
                System.out.print("\nНапишите здесь: ");

                int StartOne = scanner.nextInt();

                switch (StartOne) {
                    default -> {
                        System.out.println("Ты что то не то ввёл");
                        return;
                    }
                    case 1 -> {
                        int PlayerSize;

                        System.out.print("Введите размер массива : ");
                        PlayerSize = scanner.nextInt();

                        if (PlayerSize > 0 && PlayerSize <= 10) {

                        } else {
                            System.out.println("Ошибка! Размер массива не должен быть больше 10.");
                            return;
                        }

                        int One = 0;
                        int Two = 1;
                        System.out.println("\nХорошо");
                        int[] value = new int[PlayerSize];
                        for (int i = 0; i < value.length; i++) {
                            value[i] = (int) (Math.random() * 100) + 1;
                        }

                        System.out.println("\nПрямой порядок: ");
                        for (int i = 0; i < value.length; i++) {
                            System.out.print(value[i] + " ");

                        }
                        System.out.println("\nОбратный порядок:");
                        for (int i = value.length - 1; i >= 0; i--) {
                            System.out.print(value[i] + " ");
                        }
                        System.out.println("\n");
                        printDash("Продолжим?");
                        System.out.println("1 - дать выбор ещё раз");
                        System.out.println("2 - выбрать другой урок");
                        System.out.print("\nПишите здесь: ");
                        int stop = scanner.nextInt();

                        switch (stop) {
                            case 1 -> LessonOne.run();
                            case 2 -> {
                                return;
                            }
                        }

                    }

                    case 2 -> {
                        int playerSize;


                        System.out.print("Введите размер массива : ");
                        playerSize = scanner.nextInt();

                        if (playerSize > 0 && playerSize <= 10) {

                        } else {
                            System.out.println("Ошибка! Размер массива не должен быть больше 10.");
                            return;
                        }


                        int[] values = new int[playerSize];
                        System.out.println("Отлично! Теперь введи " + playerSize + " чисел по очереди:");


                        for (int i = 0; i < values.length; i++) {
                            System.out.print("Введите число для ячейки [" + i + "]: ");
                            values[i] = scanner.nextInt();
                        }


                        System.out.println("\nПрямой порядок:");
                        for (int i = 0; i < values.length; i++) {
                            System.out.print(values[i] + " ");
                        }


                        System.out.println("\nОбратный порядок:");
                        for (int i = values.length - 1; i >= 0; i--) {
                            System.out.print(values[i] + " ");
                        }
                        System.out.println();

                    }
                }
                System.out.println("\n");
                printDash("Продолжим?");
                System.out.println("1 - дать выбор ещё раз");
                System.out.println("2 - выбрать другой урок");
                System.out.print("\nПишите здесь: ");
                int stop = scanner.nextInt();

                if (stop == 1) {

                } else if (stop == 2) {
                    return;
                } else {
                    System.out.println("Неизвестная команда, возвращаюсь в меню...");
                    return;
                }
            }

        }
    }





/*Задача 2:
Найти минимальный-максимальный элементы и вывести в консоль*/




    static class LessonTwo {
        public static void run() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Отлично ты выбрал урок 2");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("↓ Выбирай ↓");
            System.out.println("1 - Рандом");
            System.out.println("2 - Выбрать самому");
            System.out.print("Введи тут: ");
            int StartLessonsTwo = scanner.nextInt();

            switch (StartLessonsTwo) {
                case 2 -> {
                    int orally;

                    while (true) {

                        System.out.print("Введите размер массива : ");
                        orally = scanner.nextInt();

                        if (orally > 0 && orally <= 10) {

                        } else {
                            System.out.println("Ошибка! Размер массива не должен быть больше 10.");
                            return;
                        }


                        int[] values = new int[orally];
                        System.out.println("Отлично! Теперь введи " + orally + " чисел по очереди:");


                        for (int i = 0; i < values.length; i++) {
                            System.out.print("Введите число для ячейки [" + i + "]: ");
                            values[i] = scanner.nextInt();
                        }


                        Arrays.sort(values);
                        System.out.println("Сортирование от меньшего до большего: " + Arrays.toString(values));

                        System.out.print("Сортирование от большего до меньшего: ");
                        Arrays.sort(values);
                        for (int i = values.length - 1; i >= 0; i--) {
                            System.out.print("[" + values[i] + "]  ");

                        }


                        System.out.println("\n");
                        printDash("Продолжим?");
                        System.out.println("1 - дать выбор ещё раз");
                        System.out.println("2 - выбрать другой урок");
                        System.out.print("\nПишите здесь: ");
                        int Quest = scanner.nextInt();

                        if (Quest == 1) {

                        } else if (Quest == 2) {
                            return;
                        } else {
                            System.out.println("Неизвестная команда, возвращаюсь в меню...");
                            return;


                        }
                    }


                }
                default -> {
                    System.out.println("Ты что то не то ввёл");
                    return;
                }
                case 1 -> {

                    System.out.print("Хорошо выбираю рандомные числа для массива");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    int playerSizeLessonTwo;

                    System.out.print("\nВведите размер массива: ");
                    playerSizeLessonTwo = scanner.nextInt();

                    if (playerSizeLessonTwo > 0 && playerSizeLessonTwo <= 10) {

                    } else {
                        System.out.println("Ошибка! Размер массива не должен быть больше 10.");
                        return;
                    }

                    int[] ValuesLessonTwo = new int[playerSizeLessonTwo];
                    for (int i = 0; i < ValuesLessonTwo.length; i++) {
                        ValuesLessonTwo[i] = (int) (Math.random() * 100) + 1;
                    }
                    System.out.println("Рандомные числа: " + Arrays.toString(ValuesLessonTwo));

                    Arrays.sort(ValuesLessonTwo);

                    System.out.println("Сортирование от меньшего до большего: " + Arrays.toString(ValuesLessonTwo));
                    System.out.print("Сортирование от большего до меньшего: ");
                    Arrays.sort(ValuesLessonTwo);
                    for (int i = ValuesLessonTwo.length - 1; i >= 0; i--) {
                        System.out.print("[" + ValuesLessonTwo[i] + "]  ");

                    }

                    System.out.println("\n");
                    printDash("Продолжим?");
                    System.out.println("1 - дать выбор ещё раз");
                    System.out.println("2 - выбрать другой урок");
                    System.out.print("\nПишите здесь: ");
                    int Quest = scanner.nextInt();

                    if (Quest == 1) {

                    } else if (Quest == 2) {
                        return;
                    } else {
                        System.out.println("Неизвестная команда, возвращаюсь в меню...");
                        return;


                    }
                }
            }


        }
    }



    /*Задача 3:
Найти индексы минимального и максимального элементов и вывести в консоль.*/




    static class LessonThree {
        public static void run() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Отлично ты выбрал урок 3");
            System.out.println("↓ Теперь выберай ↓");
            System.out.println("1 - Рандом");
            System.out.println("2 - Написать Самому");
            System.out.print("Выбираешь: ");

            int startLessonThree = scanner.nextInt();

            switch (startLessonThree) {
                case 1 -> {
                    int rundom;

                    while (true) {
                        System.out.println("Ты выбрал рандом");
                        System.out.print("Введите размер массива : ");
                        rundom = scanner.nextInt();

                        if (rundom > 0 && rundom <= 10) {

                        } else {
                            System.out.println("Ошибка! Размер массива не должен быть больше 10.");
                            return;
                        }

                        int[] ValuesLessonThree = new int[rundom];
                        for (int i = 0; i < ValuesLessonThree.length; i++) {
                            ValuesLessonThree[i] = (int) (Math.random() * 100) + 1;
                        }
                        System.out.println("Рандомные числа: " + Arrays.toString(ValuesLessonThree));

                        int MaxIndex = 0;
                        int MinIndex = 0;

                        for (int i = 1; i < ValuesLessonThree.length; i++) {
                            if (ValuesLessonThree[i] > ValuesLessonThree[MaxIndex]) {
                                MaxIndex = i;
                            }
                            if (ValuesLessonThree[i] < ValuesLessonThree[MinIndex]) {
                                MinIndex = i;
                            }

                        }
                        System.out.println("Максимальное число под индексом: " + MaxIndex);
                        System.out.println("Минимальное число под индексом: " + MinIndex);

                        System.out.println("\n");
                        printDash("Продолжим?");
                        System.out.println("1 - дать выбор ещё раз");
                        System.out.println("2 - выбрать другой урок");
                        System.out.print("\nПишите здесь: ");
                        int Quest = scanner.nextInt();

                        if (Quest == 1) {

                        } else if (Quest == 2) {
                            return;
                        } else {
                            System.out.println("Неизвестная команда, возвращаюсь в меню...");
                            return;


                        }

                    }

                }

                case 2 -> {
                    System.out.println("Ладно пиши сам\nНо сначало");
                    System.out.print("Введите размер массива : ");
                    int SizeOrally = scanner.nextInt();

                    if (SizeOrally > 0 && SizeOrally <= 10) {

                    } else {
                        System.out.println("Ошибка! Размер массива не должен быть больше 10.");
                        return;
                    }
                    int[] ValuesLessonThree = new int[SizeOrally];
                    System.out.println("Отлично! Теперь введи " + SizeOrally + " чисел по очереди:");

                    for (int i = 0; i < ValuesLessonThree.length; i++) {
                        System.out.print("Введите число для ячейки [" + i + "]: ");
                        ValuesLessonThree[i] = scanner.nextInt();
                    }


                    int MaxIndex = 0;
                    int MinIndex = 0;

                    for (int i = 1; i < ValuesLessonThree.length; i++) {
                        if (ValuesLessonThree[i] > ValuesLessonThree[MaxIndex]) {
                            MaxIndex = i;
                        }
                        if (ValuesLessonThree[i] < ValuesLessonThree[MinIndex]) {
                            MinIndex = i;
                        }

                    }
                    System.out.println("Максимальное число под индексом: " + MaxIndex);
                    System.out.println("Минимальное число под индексом: " + MinIndex);

                    System.out.println("\n");
                    printDash("Продолжим?");
                    System.out.println("1 - дать выбор ещё раз");
                    System.out.println("2 - выбрать другой урок");
                    System.out.print("\nПишите здесь: ");
                    int Quest = scanner.nextInt();

                    if (Quest == 1) {

                    } else if (Quest == 2) {
                        return;
                    } else {
                        System.out.println("Неизвестная команда, возвращаюсь в меню...");
                        return;


                    }


                }
            }

        }
    }






    /*Задача 4:
Найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести сообщение, что их нет.*/





    static class LessonFour {
        public static void run() {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("Хорошо ты выбрал урок 4\n↓ Теперь выбери метод ↓");
                System.out.println("1 - Рандом");
                System.out.println("2 - Самому");
                System.out.print("Ответ: ");

                int startLessonFour = scanner.nextInt();

                switch (startLessonFour) {
                    case 1 -> {

                        int rundom;


                        System.out.println("Ты выбрал рандом");
                        System.out.print("Введите размер массива : ");
                        rundom = scanner.nextInt();

                        if (rundom > 0 && rundom <= 10) {

                        } else {
                            System.out.println("Ошибка! Размер массива не должен быть больше 10.");
                            return;
                        }

                        int[] ValuesLessonFour = new int[rundom];

                        for (int i = 0; i < ValuesLessonFour.length; i++) {
                            ValuesLessonFour[i] = (int) (Math.random() * 5);
                        }
                        System.out.println("Рандомные числа: " + Arrays.toString(ValuesLessonFour));
                        int Answer = 0;
                        for (int i = 0; i < ValuesLessonFour.length; i++) {
                            if (ValuesLessonFour[i] == 0) {
                                Answer++;
                            }
                        }

                        System.out.println("Рандомные числа: " + Arrays.toString(ValuesLessonFour));

                        if (Answer > 0) {
                            System.out.println("Количество нулевых элементов: " + Answer);
                        } else {
                            System.out.println("Нет нулей");
                        }
                        System.out.println("\n");
                        printDash("Продолжим?");
                        System.out.println("1 - дать выбор ещё раз");
                        System.out.println("2 - выбрать другой урок");
                        System.out.print("\nПишите здесь: ");
                        int Quest = scanner.nextInt();

                        if (Quest == 1) {

                        } else if (Quest == 2) {
                            return;
                        } else {
                            System.out.println("Неизвестная команда, возвращаюсь в меню...");
                            return;


                        }

                    }
                    case 2 -> {


                        System.out.println("Ты выбрал Написать самому");


                        System.out.println("Ладно пиши сам\nНо сначало");
                        System.out.print("Введите размер массива : ");
                        int SizeOrally = scanner.nextInt();

                        if (SizeOrally > 0 && SizeOrally <= 10) {

                        } else {
                            System.out.println("Ошибка! Размер массива не должен быть больше 10.");
                            return;
                        }
                        int[] ValuesLessonFour = new int[SizeOrally];
                        System.out.println("Отлично! Теперь введи " + SizeOrally + " чисел по очереди:");

                        for (int i = 0; i < ValuesLessonFour.length; i++) {
                            System.out.print("Введите число для ячейки [" + i + "]: ");
                            ValuesLessonFour[i] = scanner.nextInt();
                        }
                        int Answer = 0;
                        for (int i = 0; i < ValuesLessonFour.length; i++) {
                            if (ValuesLessonFour[i] == 0) {
                                Answer++;
                            }
                        }

                        if (Answer > 0) {
                            System.out.println("Количество нулевых элементов: " + Answer);
                        } else {
                            System.out.println("Нет нулей");
                        }
                        System.out.println("\n");
                        printDash("Продолжим?");
                        System.out.println("1 - дать выбор ещё раз");
                        System.out.println("2 - выбрать другой урок");
                        System.out.print("\nПишите здесь: ");
                        int Quest = scanner.nextInt();

                        if (Quest == 1) {
                            continue;

                        } else if (Quest == 2) {
                            return;
                        } else {
                            System.out.println("Неизвестная команда, возвращаюсь в меню...");
                            return;


                        }


                    }
                }

            }
        }
    }



    /*Задача 5:
Пройти по массиву и поменять местами элементы первый и последний, второй и
предпоследний и т.д.*/







    static class LessonFive {
        public static void run() {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("Отлично ты выбрал урок 5");
                System.out.println("↓ Выбери какой метод тебе лучше будет ↓\n1 - Рандом\n2 - Самому");
                System.out.print("Выбираешь: ");
                int StartLessonFive = scanner.nextInt();

                switch (StartLessonFive) {
                    case 1 -> {
                        int rundom;

                        System.out.println("Ты выбрал рандом");
                        System.out.print("Введите размер массива : ");
                        rundom = scanner.nextInt();

                        if (rundom > 0 && rundom <= 10) {

                        } else {
                            System.out.println("Ошибка! Размер массива не должен быть больше 10.");
                            return;
                        }


                        int[] ValuesLessonFive = new int[rundom];
                        for (int i = 0; i < ValuesLessonFive.length; i++) {
                            ValuesLessonFive[i] = (int) (Math.random() * 100) + 1;
                        }
                        System.out.println("Рандомные числа: " + Arrays.toString(ValuesLessonFive));
                        for (int i = 0; i < ValuesLessonFive.length / 2; i++) {
                            int FilledElement = ValuesLessonFive[i];

                            int partner = ValuesLessonFive.length - 1 - i;

                            ValuesLessonFive[i] = ValuesLessonFive[partner];

                            ValuesLessonFive[partner] = FilledElement;
                        }
                        System.out.println("Ответ: " + Arrays.toString(ValuesLessonFive));
                        System.out.println("\n");
                        printDash("Продолжим?");
                        System.out.println("1 - дать выбор ещё раз");
                        System.out.println("2 - выбрать другой урок");
                        System.out.print("\nПишите здесь: ");
                        int Quest = scanner.nextInt();

                        if (Quest == 1) {

                        } else if (Quest == 2) {
                            return;
                        } else {
                            System.out.println("Неизвестная команда, возвращаюсь в меню...");
                            return;


                        }


                    }
                    case 2 -> {
                        System.out.println("Ладно пиши сам\nНо сначало");
                        System.out.print("Введите размер массива : ");
                        int SizeOrally = scanner.nextInt();

                        if (SizeOrally > 0 && SizeOrally <= 10) {

                        } else {
                            System.out.println("Ошибка! Размер массива не должен быть больше 10.");
                            return;
                        }
                        int[] ValuesLessonFive = new int[SizeOrally];
                        System.out.println("Отлично! Теперь введи " + SizeOrally + " чисел по очереди:");

                        for (int i = 0; i < ValuesLessonFive.length; i++) {
                            System.out.print("Введите число для ячейки [" + i + "]: ");
                            ValuesLessonFive[i] = scanner.nextInt();
                        }
                        for (int i = 0; i < ValuesLessonFive.length / 2; i++) {
                            int FilledElement = ValuesLessonFive[i];

                            int partner = ValuesLessonFive.length - 1 - i;

                            ValuesLessonFive[i] = ValuesLessonFive[partner];

                            ValuesLessonFive[partner] = FilledElement;
                        }
                        System.out.println("Ответ: " + Arrays.toString(ValuesLessonFive));
                        System.out.println("\n");
                        printDash("Продолжим?");
                        System.out.println("1 - дать выбор ещё раз");
                        System.out.println("2 - выбрать другой урок");
                        System.out.print("\nПишите здесь: ");
                        int Quest = scanner.nextInt();

                        if (Quest == 1) {

                        } else if (Quest == 2) {
                            return;
                        } else {
                            System.out.println("Неизвестная команда, возвращаюсь в меню...");
                            return;


                        }

                    }
                }


            }
        }
    }






    /*Задача 6:
Проверить, является ли массив возрастающей последовательностью (каждое следующее
число больше предыдущего).*/






    static class LessonSix {
        public static void run() {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("Отлично ты выбрал урок 6");
                System.out.println("↓ Выбери какой метод тебе лучше будет ↓\n1 - Рандом\n2 - Самому");
                System.out.print("Выбираешь: ");
                int StartLessonSix = scanner.nextInt();

                switch (StartLessonSix) {
                    case 1 -> {
                        int rundom;

                        System.out.println("Ты выбрал рандом");
                        System.out.print("Введите размер массива : ");
                        rundom = scanner.nextInt();

                        if (rundom > 1 && rundom <= 10) {

                        } else {
                            System.out.println("Ошибка! Размер массива не должен быть больше 10 или меньше 2.");
                            return;
                        }


                        int[] ValuesLessonSix = new int[rundom];
                        for (int i = 0; i < ValuesLessonSix.length; i++) {
                            ValuesLessonSix[i] = (int) (Math.random() * 100) + 1;
                        }
                        System.out.println("Рандомные числа: " + Arrays.toString(ValuesLessonSix));
                        boolean isUc = true;
                        for (int i = 0; i < ValuesLessonSix.length; i++) {
                            if (ValuesLessonSix[i] >= ValuesLessonSix[i + 1]) {
                                isUc = false;
                                break;
                            }
                        }
                        if (isUc) {
                            System.out.println("Массив является возрастающей Последовательностью");
                        } else {
                            System.out.println("Массив Не является возрастающей Последовательностью");
                        }
                        System.out.println("\n");
                        printDash("Продолжим?");
                        System.out.println("1 - дать выбор ещё раз");
                        System.out.println("2 - выбрать другой урок");
                        System.out.print("\nПишите здесь: ");
                        int Quest = scanner.nextInt();

                        if (Quest == 1) {

                        } else if (Quest == 2) {
                            return;
                        } else {
                            System.out.println("Неизвестная команда, возвращаюсь в меню...");
                            return;


                        }


                    }
                    case 2 -> {
                        System.out.println("Ладно пиши сам\nНо сначало");
                        System.out.println("Ты выбрал рандом");
                        System.out.print("Введите размер массива : ");
                        int SizeOrally = scanner.nextInt();

                        if (SizeOrally > 1 && SizeOrally <= 10) {

                        } else {
                            System.out.println("Ошибка! Размер массива не должен быть больше 10 или меньше 2.");
                            return;
                        }
                        int[] ValuesLessonSix = new int[SizeOrally];
                        System.out.println("Отлично! Теперь введи " + SizeOrally + " чисел по очереди:");

                        for (int i = 0; i < ValuesLessonSix.length; i++) {
                            System.out.print("Введите число для ячейки [" + i + "]: ");
                            ValuesLessonSix[i] = scanner.nextInt();
                        }
                        boolean isUc = true;
                        for (int i = 0; i < ValuesLessonSix.length - 1; i++) {
                            if (ValuesLessonSix[i] >= ValuesLessonSix[i + 1]) {
                                isUc = false;
                                break;
                            }
                        }
                        if (isUc) {
                            System.out.println("Массив является возрастающей Последовательностью");
                        } else {
                            System.out.println("Массив Не является возрастающей Последовательностью");
                        }
                        System.out.println("\n");
                        printDash("Продолжим?");
                        System.out.println("1 - дать выбор ещё раз");
                        System.out.println("2 - выбрать другой урок");
                        System.out.print("\nПишите здесь: ");
                        int Quest = scanner.nextInt();

                        if (Quest == 1) {

                        } else if (Quest == 2) {
                            return;
                        } else {
                            System.out.println("Неизвестная команда, возвращаюсь в меню...");
                            return;


                        }

                    }
                }
            }
        }
    }





    /*Задача *:
Имеется массив из неотрицательных чисел(любой). Представьте что массив
представляет целое число (Например массив {1,2,3} -> 123, {9,9,9} -> 999). Задача
добавить единицу к этому “числу” и на выходе получить исправленный массив. Массив не
содержит нуля в начале, кроме самого числа 0.
Пример:
Input: [1,4,0,5,6,3]
Output: [1,4,0,5,6,4]
Input: [9,9,9]
Output: [1,0,0,0]
*/











    static class LessonSeven {
        public static void run() {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("Отлично ты выбрал урок со звёздочкой *");
                System.out.println("↓ Выбери какой метод тебе лучше будет ↓\n1 - Рандом\n2 - Самому");
                System.out.print("Выбираешь: ");
                int StartLessonSeven = scanner.nextInt();

                switch (StartLessonSeven) {
                    case 1 -> {
                        int rundom;

                        System.out.println("Ты выбрал рандом");
                        System.out.print("Введите размер массива : ");
                        rundom = scanner.nextInt();

                        if (rundom > 1 && rundom < 10) {

                        } else {
                            System.out.println("Ошибка! Размер массива не должен быть больше 10.");
                            return;
                        }


                        int[] ValuesLessonSix = new int[rundom];
                        for (int i = 0; i < ValuesLessonSix.length; i++) {
                            ValuesLessonSix[i] = (int) (Math.random() * 10) + 1;
                        }
                        System.out.println("Рандомные числа: " + Arrays.toString(ValuesLessonSix));

                        if (ValuesLessonSix.length > 1 && ValuesLessonSix[0] ==  0) {
                            ValuesLessonSix[0] = (int) (Math.random() * 9) + 1;
                        }
                        System.out.println("Исходный массив: " + Arrays.toString(ValuesLessonSix));

                        int[] result = ValuesLessonSix;
                        boolean carried = false;

                        for (int i = result.length - 1; i >= 0; i--) {
                            if (result[i] < 9) {
                                result[i]++;
                                carried = true;
                                break;
                            } else {
                                result[i] = 0;
                            }
                        }
                        if (!carried) {
                            int[] newArray = new int [result.length + 1];
                            newArray[0] = 1;
                            result = newArray;
                        }
                        System.out.println("Массив + 1:     " + Arrays.toString(result));
                        System.out.println("\n");
                        printDash("Продолжим?");
                        System.out.println("1 - дать выбор ещё раз");
                        System.out.println("2 - выбрать другой урок");
                        System.out.print("\nПишите здесь: ");
                        int Quest = scanner.nextInt();

                        if (Quest == 1) {

                        } else if (Quest == 2) {
                            return;
                        } else {
                            System.out.println("Неизвестная команда, возвращаюсь в меню...");
                            return;


                        }


                    }
                    case 2 -> {
                        System.out.println("Ладно пиши сам\nНо сначало");
                        System.out.print("Введите размер массива : ");
                        int SizeOrally = scanner.nextInt();

                        if (SizeOrally > 0  && SizeOrally < 10) {

                        } else {
                            System.out.println("Ошибка! Размер массива не должен быть больше 10 ");
                            return;
                        }
                        int[] ValuesLessonSix = new int[SizeOrally];
                        System.out.println("Отлично! Теперь введи " + SizeOrally + " чисел по очереди:");

                        for (int i = 0; i < ValuesLessonSix.length; i++) {
                            System.out.print("Введите число для ячейки [" + i + "]: ");
                            int input = scanner.nextInt();
                            if (input > 0 && input < 9) {
                                ValuesLessonSix[i] = input;

                            } else {
                                System.out.println("Вводи только от 1 до 9!");
                                return;
                            }
                        }

                        System.out.println("Исходный массив: " + Arrays.toString(ValuesLessonSix));

                        int[] result = ValuesLessonSix;
                        boolean carried = false;

                        for (int i = result.length - 1; i >= 0; i--) {
                            if (result[i] < 9) {
                                result[i]++;
                                carried = true;
                                break;
                            } else {
                                result[i] = 0;
                            }
                        }
                        if (!carried) {
                            int[] newArray = new int [result.length + 1];
                            newArray[0] = 1;
                            result = newArray;
                        }
                        System.out.println("Массив + 1:     " + Arrays.toString(result));
                        System.out.println("\n");
                        printDash("Продолжим?");
                        System.out.println("1 - дать выбор ещё раз");
                        System.out.println("2 - выбрать другой урок");
                        System.out.print("\nПишите здесь: ");
                        int Quest = scanner.nextInt();

                        if (Quest == 1) {

                        } else if (Quest == 2) {
                            return;
                        } else {
                            System.out.println("Неизвестная команда, возвращаюсь в меню...");
                            return;


                        }

                    }
                }
            }
        }
    }
}




