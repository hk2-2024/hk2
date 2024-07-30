package collection.array;

import java.util.Arrays;

public class ArrayMain1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println("input");
        arr[0] =1;
        arr[1] =2;
        System.out.println(Arrays.toString(arr));

        int newValue =3;
        addFirst(arr, newValue);
        System.out.println(Arrays.toString(arr));

        int index=2;
        int value =4;
        addIndex(arr, index, value);
        System.out.println(Arrays.toString(arr));

        addLast(arr, 5);
        System.out.println(Arrays.toString(arr));

    }



    private static void addLast(int[] arr, int newValue) {
        arr[arr.length-1] = newValue;
    }

    private static void addFirst(int[] arr,  int value) {
        for (int i =  arr.length-1; i>0; i--) {
            arr[i] = arr[i-1];

        }
        arr[0] = value;
    }
    private static void addIndex(int[] arr, int index, int value) {
        for (int i =  arr.length-1; i>index; i--) {
            arr[i] = arr[i-1];

        }
        arr[index] = value;
    }
}
