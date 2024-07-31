package collection.set.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetOperationsTest {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));
        //코드 작성
//        Set<Integer> setSum = new HashSet<>(List.of(set1, set2));
        Set<Integer> setSum = new HashSet<>();
        setSum.addAll(set1);
        setSum.addAll(set2);
        System.out.println("합집합 = " + setSum);

        //System.out.println("합집합 = " + setSum.contains(set1));

        Set<Integer> setkyu = new HashSet<>();
        Iterator<Integer> iter = setSum.iterator();
        while (iter.hasNext()) {
            Integer value = iter.next();
            if (set1.contains(value)) {
                if (set2.contains(value)) {
                    setkyu.add(value);
                }
            }
        }
        System.out.println("setkyu = " + setkyu);

        Set<Integer> set3 = new HashSet<>(setSum);

        set3.retainAll(set1);
        //System.out.println("set3 = " + set3);
        set3.retainAll(set2);
        System.out.println("교집합 = " + set3);


//        System.out.println("setSum = " + setSum);
        set1.removeAll(set2);
        System.out.println("차집합 = " + set1);

    }
}
