package homeworkCollections.model;

import java.util.Arrays;

public class DynamicArray {
    private Student[] data;
    private int size;

    public DynamicArray() {
        data = new Student[10];
        size = 0;
    }

    public DynamicArray(int capacity) {
        if (capacity < 10) {
            capacity = 10;
        }
        data = new Student[capacity];
        size = 0;
    }

    public int size() {
        return size;
    }

    public Student get(int index) {
        rangeCheck(index);
        return data[index];
    }

    public boolean remove(Student student) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(student)) {
                data[i] = null;
            }
            return false;
        }
        return true;
    }

    public boolean add(Student student) {
        ensureCapacity(size + 1);
        data[size++] = student;
        return true;
    }

    public void ensureCapacity(int minCapacity) {
        int oldCapacity = data.length;
        if (minCapacity > oldCapacity) {
            int newCapacity = (oldCapacity * 2);
            if (newCapacity < minCapacity) {
                newCapacity = minCapacity;
            }
            data = Arrays.copyOf(data, newCapacity);
        }
    }

    private void rangeCheck(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    public static void print(DynamicArray dynamicArray) {
        for (int i = 0; i < dynamicArray.size; i++) {
            System.out.println(dynamicArray.get(i));
        }
    }
}
