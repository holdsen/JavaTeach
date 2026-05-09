package HomeWork20.Lesson3;

class Manufacturer implements Runnable {
    Store store;
    Manufacturer(Store store) { this.store = store; }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            store.put();
        }
    }
}



