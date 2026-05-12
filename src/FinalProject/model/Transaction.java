package FinalProject.model;

public class Transaction {
    public String from, to, fileName;
    public int amount;

    public Transaction(String from, String to, int amount, String fileName) {
        this.from = from;
        this.to = to;
        this.amount = amount;
        this.fileName = fileName;
    }
}