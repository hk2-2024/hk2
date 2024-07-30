package collection.set.test;

import java.util.HashSet;
import java.util.Iterator;

public class UniqueNamesTest1 {
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        // 코드 작성
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < inputArr.length; i++) {
            hashSet.add(inputArr[i]);
        }

        System.out.println("hashSet = " + hashSet);
        Iterator<Integer> iter = hashSet.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next());
        }
        System.out.println();
    }
}
