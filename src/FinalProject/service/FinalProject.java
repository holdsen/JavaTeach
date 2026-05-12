package FinalProject.service;

import FinalProject.model.*;
import FinalProject.util.Logger;
import java.io.*;
import java.util.*;

public class FinalProject {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        AccountService accService = new AccountService();
        ParserService parser = new ParserService();
        ReportService reportService = new ReportService();

        // Микита измени тут твой путь
        String db = "D:\\JavaTeach\\src\\FinalProject\\accounts_db.txt";
        String input = "D:\\JavaTeach\\src\\FinalProject\\input\\";
        String archive = "D:\\JavaTeach\\src\\FinalProject\\archive\\";

        while (true) {
            System.out.println(Logger.YELLOW + "\n--- БАНКОВСКАЯ СИСТЕМА ---" + Logger.RESET);
            System.out.println("1. Запустить парсинг ");
            System.out.println("2. Показать отчет ");
            System.out.println("0. Выход");
            String choice = scan.next();
            if (choice.equals("1")) {
                try {
                    Map<String, Account> accounts = accService.loadAccounts(db);
                    List<Transaction> trans = parser.parseInputFolder(input);
                    if (trans.isEmpty()) {
                        Logger.info("Нет новых файлов для обработки.");
                        continue;
                    }
                    for (Transaction t : trans) {
                        Account sender = accounts.get(t.from);
                        Account receiver = accounts.get(t.to);
                        String status, msg;
                        if (sender != null && receiver != null && sender.getBalance() >= t.amount) {
                            sender.setBalance(sender.getBalance() - t.amount);
                            receiver.setBalance(receiver.getBalance() + t.amount);
                            status = "УСПЕШНО";
                            msg = "Перевод " + t.amount + " с " + t.from + " на " + t.to;
                            Logger.success(msg);
                        } else {
                            status = "ОШИБКА";
                            msg = "Ошибка данных или баланса в файле подробнее в info.txt " + t.fileName;
                            Logger.error(msg);
                        }
                        reportService.writeLog(t.fileName, status, msg);
                        new File(input + t.fileName).renameTo(new File(archive + t.fileName));
                    }
                    accService.saveAccounts(accounts, db);
                    Logger.info("База счетов обновлена.");
                } catch (IOException e) {
                    Logger.error("Критическая ошибка: " + e.getMessage());
                }
            } else if (choice.equals("2")) {
                reportService.printReport();
            } else if (choice.equals("0")) {
                break;
            }
        }
    }
}