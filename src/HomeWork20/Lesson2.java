package HomeWork20;
import java.util.*;
import java.io.*;
public class Lesson2 {
    Scanner scan = new Scanner(System.in);
    class Sorters {
        public static void bubbleSort(int[] arr) {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }

        public static void selectionSort(int[] arr) {
            for (int i = 0; i < arr.length - 1; i++) {
                int minIdx = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < arr[minIdx]) minIdx = j;
                }
                int temp = arr[minIdx];
                arr[minIdx] = arr[i];
                arr[i] = temp;
            }
        }

        public static void insertionSort(int[] arr) {
            for (int i = 1; i < arr.length; i++) {
                int key = arr[i];
                int j = i - 1;
                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
                }
                arr[j + 1] = key;
            }
        }
    }

        public static void main(String[] args) throws InterruptedException {
            int[] original = {5, 2, 9, 1, 5, 6};
            int[] arr1 = Arrays.copyOf(original, original.length);
            int[] arr2 = Arrays.copyOf(original, original.length);
            int[] arr3 = Arrays.copyOf(original, original.length);

            Thread t1 = new Thread(() -> Sorters.bubbleSort(arr1));
            Thread t2 = new Thread(() -> Sorters.selectionSort(arr2));
            Thread t3 = new Thread(() -> Sorters.insertionSort(arr3));

            t1.start();
            t2.start();
            t3.start();

            t1.join();
            t2.join();
            t3.join();

            System.out.println("Сортировка пузырьком: " + Arrays.toString(arr1));
            System.out.println("Сортировка вставками: " + Arrays.toString(arr2));
            System.out.println("Сортировка выбором: " + Arrays.toString(arr3));
        }
    }
