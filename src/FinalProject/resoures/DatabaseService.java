package FinalProject.resoures;

import FinalProject.model.Transaction;
import FinalProject.util.Logger;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DatabaseService {
    private static final String DB_FILE_PATH = "D:\\JavaTeach\\src\\FinalProject\\database_storage.txt";

    public DatabaseService() {
        File file = new File(DB_FILE_PATH);
        if (!file.exists()) {
            try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)))) {
                out.println("ID | FILE_NAME | SENDER | RECEIVER | AMOUNT | STATUS | MESSAGE | PROCESSED_AT");
                Logger.info("Таблица 'processed_transactions' успешно создана в локальной БД.");
            } catch (IOException e) {
                Logger.error("Ошибка создания таблицы БД: " + e.getMessage());
            }
        }
    }

    public void saveTransaction(Transaction t, String status, String message) {
        File file = new File(DB_FILE_PATH);
        int nextId = 1;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while (br.readLine() != null) {
                nextId++;
            }
        } catch (IOException e) {
        }
        try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(DB_FILE_PATH, true)))) {
            String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            out.println(nextId + " | " +
                    t.fileName + " | " +
                    t.from + " | " +
                    t.to + " | " +
                    t.amount + " | " +
                    status + " | " +
                    message + " | " +
                    time);
        } catch (IOException e) {
            Logger.error("Ошибка сохранения транзакции в локальную БД: " + e.getMessage());
        }
    }
}
