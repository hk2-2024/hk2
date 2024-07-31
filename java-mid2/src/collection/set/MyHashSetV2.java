package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV2 {
    //private int[] elementData = new int[10];
    private static final int CAPA = 16;

    private LinkedList<Object>[] buckets;
    private int size=0;
    private int capacity = CAPA;

    public MyHashSetV2() {
        initBuckets();
    }
    public MyHashSetV2(int capacity) {
        this.capacity = capacity;
        initBuckets();

    }

    private void initBuckets() {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }



    public boolean add(Object value) {
        int index = hashIndex(value);
        LinkedList<Object> bucket = buckets[index];

        if (bucket.contains(value)) {
            return false;
        }
        bucket.add(value);
        size++;

        return true;
    }

    public boolean remove(Object value) {
        int index = hashIndex(value);
        LinkedList<Object> bucket = buckets[index];
        boolean result = bucket.remove(value);
        if (result) {
            size--;
            return true;
        }
        return false;
    }

    public boolean contains(Object value) {
        int index = hashIndex(value);
        LinkedList<Object> bucket = buckets[index];
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
        return "MyHashSetV2{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                '}';
    }

    private  int hashIndex(Object searchValue) {
        return Math.abs(searchValue.hashCode())% capacity;
    }
}
