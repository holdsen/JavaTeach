package HomeWork20.Lesson3;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();

        new Thread(new Manufacturer(store)).start();
        new Thread(new Customer(store)).start();
    }
}

