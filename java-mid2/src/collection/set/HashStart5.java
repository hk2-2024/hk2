package collection.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class HashStart5 {
    static final int CAPACITY = 2;

    public static void main(String[] args) {
        LinkedList<Integer>[] buckets = new LinkedList[CAPACITY];
//        ArrayList<LinkedList<Integer>> buckets = new ArrayList<LinkedList<Integer>>();

        for (int i = 0; i < CAPACITY; i++) {
            buckets[i] = new LinkedList<>();

        }

        add(buckets, 1);
        add(buckets, 2);
        add(buckets, 5);
        add(buckets, 8);
        add(buckets, 14);
        add(buckets, 99);
        add(buckets, 9); //중복
        System.out.println("buckets = " + Arrays.toString(buckets));

        int searchValue = 9;
        boolean contains = contains(buckets, searchValue);
        System.out.println("buckets.contains(" + searchValue + ") = " +                contains);

    }
    public static void add(LinkedList<Integer>[] buckets, int value) {
        LinkedList<Integer> buck = new LinkedList<>();
        int index = hashIndex(value);

        buck = buckets[index];

            if (!buck.contains(value)) {
                buck.add(value);
            }
    }
/*
    private static void add(LinkedList<Integer>[] buckets, int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex]; // O(1)
        if (!bucket.contains(value)) { // O(n)
            bucket.add(value);
        }


    }*/

    private static boolean contains(LinkedList<Integer>[] buckets, int searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex];

        return bucket.contains(searchValue);
    }

    private static int hashIndex(int searchValue) {
        return searchValue%CAPACITY;
    }
}
