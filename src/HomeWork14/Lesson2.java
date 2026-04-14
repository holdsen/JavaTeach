package HomeWork14;

import java.io.*;
import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите путь к файлу: ");
        String path = console.nextLine();
        File inputFile = new File(path);
        File validReport = new File("valid_report.txt");
        File invalidReport = new File("invalid_report.txt");
        try (Scanner fileScanner = new Scanner(inputFile);
             BufferedWriter validWriter = new BufferedWriter(new FileWriter(validReport));
             BufferedWriter invalidWriter = new BufferedWriter(new FileWriter(invalidReport))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine().trim();
                if (line.isEmpty()) continue;
                String reason = "";
                if (line.length() != 15) {
                    reason = "Длина не равна 15 символам";
                } else if (!(line.startsWith("docnum") || line.startsWith("contract"))) {
                    reason = "Неверный префикс (должен быть docnum или contract)";
                } else if (!line.matches("[a-zA-Z0-9]+")) {
                    reason = "Содержит запрещенные спецсимволы";
                }
                if (reason.isEmpty()) {
                    validWriter.write(line);
                    validWriter.newLine();
                } else {
                    invalidWriter.write(line + " — " + reason);
                    invalidWriter.newLine();
                }
            }
            System.out.println("Обработка завершена. Проверьте файлы отчетов.");
        } catch (FileNotFoundException e) {
            System.err.println("Ошибка: Исходный файл не найден.");
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        } finally {
            console.close();
        }
    }
}
