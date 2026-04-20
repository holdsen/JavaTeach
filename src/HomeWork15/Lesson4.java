package HomeWork15;

import java.util.Arrays;

public class Lesson4<T> {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    public Lesson4() {
        this.elements = new Object[DEFAULT_CAPACITY];
    }
    public Lesson4(int initialCapacity) {
        if (initialCapacity > 0) {
            this.elements = new Object[initialCapacity];
        } else {
            throw new IllegalArgumentException("Размер должен быть больше 0");
        }
    }
    public void add(T element) {
        if (size == elements.length) {
            grow();
        }
        elements[size++] = element;
    }
    public void remove(int index) {
        checkIndex(index);
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elements, index + 1, elements, index, numMoved);
        }
        elements[--size] = null;
    }
    @SuppressWarnings("unchecked") //Типо подать предупреждения
    public T get(int index) {
        checkIndex(index);
        return (T) elements[index];
    }
    public boolean contains(T element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    private void grow() {
        int newCapacity = elements.length + (elements.length / 2) + 1;
        elements = Arrays.copyOf(elements, newCapacity);
        System.out.println("--- Массив расширен до: " + newCapacity + " ---");
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Индекс: " + index + ", Размер: " + size);
        }
    }

    public int size() {
        return size;
    }
}