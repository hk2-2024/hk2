package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV1 {
    //private int[] elementData = new int[10];
    private static final int CAPA = 16;

    LinkedList<Integer>[] buckets;
    private int size=0;
    private int capacity = CAPA;

    public MyHashSetV1() {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public MyHashSetV1(int capacity) {
        this.capacity = capacity;
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public boolean add(int value) {
        int index = hashIndex(value);
        LinkedList<Integer> bucket = buckets[index];

        if (bucket.contains(value)) {
            return false;
        }
        bucket.add(value);
        size++;

        return true;
    }

    public boolean remove(int value) {
        int index = hashIndex(value);
        LinkedList<Integer> bucket = buckets[index];
        boolean result = bucket.remove(Integer.valueOf(value));
        if (result) {
            size--;
            return true;
        }
        return false;
    }

    public boolean contains(int value) {
        int index = hashIndex(value);
        LinkedList<Integer> bucket = buckets[index];
        if (bucket.contains(value)) {
            return true;
        }
        return false;

    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV1{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                '}';
    }

    private  int hashIndex(int searchValue) {
        return searchValue% capacity;
    }
}
