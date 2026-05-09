package HomeWork20.Lesson3;

import HomeWork20.Lesson3.Store;

class Customer implements Runnable {
    Store store;

    Customer(Store store) {
        this.store = store;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            store.get();
        }
    }
}


