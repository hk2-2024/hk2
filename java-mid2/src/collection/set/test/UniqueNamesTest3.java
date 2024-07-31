package collection.set.test;

import java.util.*;

public class UniqueNamesTest3 {
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        // 코드 작성
        Set<Integer> hashSet = new TreeSet<>(List.of(inputArr));

       /* for (int i = 0; i < inputArr.length; i++) {
            hashSet.add(inputArr[i]);
        }*/

        System.out.println("hashSet = " + hashSet);
        Iterator<Integer> iter = hashSet.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next());
        }
        System.out.println();
    }
}
