package collection.array;

//import java.util.Arrays;

import java.util.Arrays;

public class MyArrayListV1 {
    private static final int DEFAULT_CAPACITY=5;
    private static Object[] elementData;
    private int size =0;

    public MyArrayListV1() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV1(int initialCapacity) {
        this.elementData = new Object[initialCapacity];
    }

    public int size() {
        return size;
    }

    public void add(Object e) {
        if (size == elementData.length) {
//            grow();
            throw new ArrayException("grow");
        }
        elementData[size]=e;
        size++;
    }

    public static void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity*2;
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    public Object get(int index) {
        return elementData[index];
    }

    public Object set(int index, Object element) {
        if (index >= elementData.length) {
            throw new RuntimeException();
        }
        Object oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }

    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elementData[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementData, size)) + " size=" +
                size + ", capacity=" + elementData.length;
    }
}
