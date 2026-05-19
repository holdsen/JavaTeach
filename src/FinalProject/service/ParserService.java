package FinalProject.service;

import FinalProject.model.Transaction;
import java.io.*;
import java.util.*;

public class ParserService {
    public List<Transaction> parseInputFolder(String folderPath) {
        List<Transaction> list = new ArrayList<>();
        File folder = new File(folderPath);
        File[] files = folder.listFiles((dir, name) -> name.endsWith(".txt"));
        if (files == null) return list;
        for (File f : files) {
            try (BufferedReader br = new BufferedReader(new FileReader(f))) {
                String line, from = "", to = "";
                double amount = 0.0;
                while ((line = br.readLine()) != null) {
                    String lowerLine = line.toLowerCase();
                    if (lowerLine.contains("sender:")) from = line.split(":")[1].trim();
                    if (lowerLine.contains("receiver:")) to = line.split(":")[1].trim();
                    if (lowerLine.contains("amount:")) amount = Double.parseDouble(line.split(":")[1].trim());
                }

                if (!from.isEmpty() && !to.isEmpty()) {
                    list.add(new Transaction(from, to, amount, f.getName()));
                }
            } catch (Exception e) {
                System.err.println("Ошибка парсинга файла: " + f.getName());
            }
        }
        return list;
    }
}
