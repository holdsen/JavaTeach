package FinalProject.service;

import FinalProject.util.Logger;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReportService {
    private static final String REPORT_PATH = "D:\\JavaTeach\\src\\FinalProject\\report.txt";

    public void writeLog(String fileName, String status, String message) {
        try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(REPORT_PATH, true)))) {
            String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            out.println(time + " | " + fileName + " | " + message + " | " + status);
        } catch (IOException e) {
            Logger.error("Не удалось записать в отчет: " + e.getMessage());
        }
    }


    public void printReport() {
        File file = new File(REPORT_PATH);
        if (!file.exists()) {
            Logger.error("Файл отчета еще не создан.");
            return;
        }
        Logger.info("--- СОДЕРЖИМОЕ ОТЧЕТА ---");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            Logger.error("Ошибка при чтении отчета: " + e.getMessage());
        }
    }
}