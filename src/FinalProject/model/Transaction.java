package FinalProject.model;

public class Transaction {
    public String from, to, fileName;
    public double amount;

    public Transaction(String from, String to, double amount, String fileName) {
        this.from = from;
        this.to = to;
        this.amount = amount;
        this.fileName = fileName;
    }
}
