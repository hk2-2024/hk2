package collection.uril;

import java.util.*;

public class OfMain {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3,4,5);
//        ArrayList<Integer> arr = List.of(1, 2, 3);
        Set<Integer> set = Set.of(1, 2, 3);
        Map<Integer, String > map = Map.of(1, "o" ,2,"t", 3,"t");

        ArrayList<Integer> arr = new ArrayList<>(list);
        list = arr;
        System.out.println(list.getClass());
        list.add(7);

        System.out.println("list = " + list);
        System.out.println("arr = " + arr);
        System.out.println("set = " + set);
        System.out.println("map = " + map);

        Collections.shuffle(arr);
        System.out.println("srr = " + arr);
        arr.sort(null);
        System.out.println("srr = " + arr);

        List<Integer> unMo = Collections.unmodifiableList(arr);
        list = unMo;


        System.out.println(list.getClass());
        System.out.println(unMo.getClass());
    }

}
