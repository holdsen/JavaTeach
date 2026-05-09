package HomeWork20;
import java.util.*;
import java.io.*;

/**
 * Домашнее задание №20
 * Данный класс содержит комплексное решение задач по теме Потоки.
 * Основные темы:

 *   - Thread
 *   - Runnable

 * @author Arsen Shaternik ★
 * @author inspector Nikita Shaternik ★
 * @version New
 * @see java.util.Scanner;
 * @since 09.05.2026

 * Потоки и наследие
 **/
public class AllLesson {
    static class MaxFilterInMassive implements Runnable {

        private int[] numbers;
        private int result;

        public MaxFilterInMassive(int[] numbers) {
            this.numbers = numbers;
        }

        @Override
        public void run() {
            int max = numbers[0];
            for (int i : numbers) {
                if (i > max) max = i;
            }
            result = max;
        }

            public int getResult () {
                return result;
        }
}
            static class MinFilterInMassive implements Runnable {
                private int[] nums;
                private int result;
                public MinFilterInMassive(int[] nums) {this.nums = nums;}
                public void run() {
                    int min = nums[0];
                    for (int n : nums) {
                        if (n < min) min = n;

                }
                    result = min;
                }
                public int getResult() {return result;}
                }


    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Сколько чисел будет в массиве?");
        int sizeMassive = scan.nextInt();
        int[] massive = new int[sizeMassive];
        for(int i = 0; i < sizeMassive; i++) {
            System.out.println("Введите " + (i + 1) + " число: ");
            massive[i] = scan.nextInt();
        }
        MaxFilterInMassive maxTask = new MaxFilterInMassive(massive);
        MinFilterInMassive minTask = new MinFilterInMassive(massive);
        Thread thread1 = new Thread(maxTask);
        Thread thread2 = new Thread(minTask);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("Поток первый (максимальное число в массиве) : " + maxTask.getResult());
        System.out.println("Поток второй (минимальное число в массиве) : " + minTask.getResult());

    }
}