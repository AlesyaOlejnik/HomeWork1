package lesson11;

import java.util.Objects;

public class CustomCollection<T> {
    private Object[] objects = new Object[0];
    private int size = 0;

    public CustomCollection(int length) {
        if (length < 0) {
            throw new NegativeArraySizeException("Длина массива должна быть больше либо равна 0.");
        }
        this.objects = new Object[length];
    }

    public CustomCollection() {
    }

    public void add(T element) {
        if (size >= objects.length - 1) {
            grow();
        }
        objects[size++] = element;
    }

    public T get(int index) {
        Objects.checkIndex(index, size);
        return (T) objects[index];
    }

    public int find(T element) {
        for (int index = 0; index < objects.length; index++) {
            T object = (T) objects[index];
            if (element.equals(object)) {
                return index;
            }
        }
        return -1;
    }

    public boolean delete(T element) {
        int index = find(element);
        if (index == -1) {
            return false;
        }
        Object[] updatedArray = new Object[objects.length - 1];
        int k = 0;
        for (int i = 0; i < objects.length; i++) {
            if (index == i) {
                continue;
            }
            updatedArray[k++] = objects[i];
        }
        size--;
        objects = updatedArray;
        return true;
    }

    public void removeAll() {
        objects = new Object[0];
        size = 0;
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < size; i++) {
            if (i != size - 1) {
                stringBuilder.append(objects[i].toString()).append(", ");
            } else {
                stringBuilder.append(objects[i].toString());
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    private void grow() {
        Object[] newArray = new Object[(objects.length + 1) * 2];
        for (int i = 0; i < objects.length; i++) {
            newArray[i] = objects[i];
        }
        objects = newArray;
    }
}
