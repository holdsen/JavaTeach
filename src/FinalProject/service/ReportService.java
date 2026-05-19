package FinalProject.service;

import FinalProject.util.Logger;
import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

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
    public void printReportByDates(String startDateStr, String endDateStr) {
        File file = new File(REPORT_PATH);
        if (!file.exists()) {
            Logger.error("Файл отчета еще не создан.");
            return;
        }
        try {
            LocalDate startDate = LocalDate.parse(startDateStr, DateTimeFormatter.ISO_LOCAL_DATE);
            LocalDate endDate = LocalDate.parse(endDateStr, DateTimeFormatter.ISO_LOCAL_DATE);

            DateTimeFormatter withSeconds = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            DateTimeFormatter noSeconds = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

            Logger.info("--- ОТЧЕТ С " + startDateStr + " ПО " + endDateStr + " ---");
            int foundCount = 0;

            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = br.readLine()) != null) {
                    if (line.trim().isEmpty()) continue;

                    String[] parts = line.split("\\|");
                    String timeStr = parts[0].trim();

                    LocalDateTime logDateTime;
                    try {
                        logDateTime = LocalDateTime.parse(timeStr, withSeconds);
                    } catch (DateTimeParseException e) {
                        logDateTime = LocalDateTime.parse(timeStr, noSeconds);
                    }

                    LocalDate logDate = logDateTime.toLocalDate();

                    if ((logDate.isAfter(startDate) || logDate.isEqual(startDate)) &&
                            (logDate.isBefore(endDate) || logDate.isEqual(endDate))) {
                        System.out.println(line);
                        foundCount++;
                    }
                }
                if (foundCount == 0) {
                    Logger.info("Записи за указанный период не найдены.");
                }
            }
        } catch (DateTimeParseException e) {
            Logger.error("Неверный формат даты! Используйте формат ГГГГ-ММ-ДД (например, 2026-05-11).");
        } catch (IOException e) {
            Logger.error("Ошибка при чтении отчета: " + e.getMessage());
        }
    }
}
