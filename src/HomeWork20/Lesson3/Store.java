package HomeWork20.Lesson3;

class Store {
    private int items = 0;
    private final int maxCapacity = 3;

    public synchronized void put() {
        while (items >= maxCapacity) {
            try {
                wait();
            } catch (InterruptedException e) { e.printStackTrace(); }
        }
        items++;
        System.out.println("Производитель добавил товар. В магазине: " + items);
        notify();
    }

    public synchronized void get() {
        while (items < 1) {
            try {
                wait();
            } catch (InterruptedException e) { e.printStackTrace(); }
        }
        items--;
        System.out.println("Покупатель купил товар. В магазине остаток: " + items);
        notify();
    }
}
