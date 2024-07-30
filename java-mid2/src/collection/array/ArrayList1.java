package collection.array;

import java.util.Arrays;

public class ArrayList1 {
    private int size=0;
    private Object[] objects;

    public ArrayList1(int size) {
        objects = new Object[size];
    }

    public void add(Object e) {
        if (objects.length == size) {
            grow();
        }
        objects[size] = e;
        size++;
    }

    public void grow() {
        int oldSize = size;
        int newSize = oldSize *2;

        objects = Arrays.copyOf(objects, newSize);
    }

    @Override
    public String toString() {
        return "ArrayList1{" +
                "size=" + objects.length +
                ", objects=" + Arrays.toString(Arrays.copyOf(objects, size)) +
                '}';
    }
}
