package FinalProject.service;

import FinalProject.model.Account;
import java.io.*;
import java.util.*;

public class AccountService {
    public Map<String, Account> loadAccounts(String path) throws IOException {
        Map<String, Account> map = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) continue;
                String[] parts = line.split("\\|");
                String num = parts[0].trim();
                int bal = Integer.parseInt(parts[1].trim());
                map.put(num, new Account(num, bal));
            }
        }
        return map;
    }

    public void saveAccounts(Map<String, Account> accounts, String path) throws IOException {
        try (PrintWriter pw = new PrintWriter(new FileWriter(path))) {
            for (Account akk : accounts.values()) {
                pw.println(akk.getNumber() + " | " + akk.getBalance());
            }
        }
    }
}