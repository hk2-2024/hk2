package collection.uril;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class EmptyListMain {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        List<Integer> list3 = Collections.emptyList();
        List<Integer> list4 = List.of();

        System.out.println("list3.getClass() = " + list3.getClass());
        System.out.println("list4.getClass() = " + list4.getClass());

        Integer[] arr = new Integer[]{1, 2, 3, 4, 5};
        List<Integer> arrList =  Arrays.asList(arr);
        arrList.set(1, 10);
        System.out.println("arrList.toString() = " + arrList.toString());
        System.out.println("arr.toString() = " + Arrays.toString(arr));


    }
}
