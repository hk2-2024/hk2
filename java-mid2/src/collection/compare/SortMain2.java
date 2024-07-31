package collection.compare;

import java.util.Arrays;
import java.util.Comparator;

import static java.util.Arrays.compare;

public class SortMain2 {

    public static void main(String[] args) {
        Integer[] array = {3, 2, 1};
        System.out.println(Arrays.toString(array));

        System.out.println("Comparator 비교");
        Arrays.sort(array, new AscComparator());

        System.out.println("AscCompare " + Arrays.toString(array));

        Arrays.sort(array, new DescComparator());
        System.out.println("DescComparator " + Arrays.toString(array));

        Arrays.sort(array, new AscComparator().reversed());
        System.out.println(Arrays.toString(array));

        Arrays.sort(array, new DescComparator().reversed());
        System.out.println(Arrays.toString(array));

    }

    private static class AscComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            System.out.println("o1=" + o1 + " o2=" + o2);
            return (o1<o2)? -1 : ((o1==o2) ? 0: 1);
        }
    }

    private static class DescComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            System.out.println("o1=" + o1 + " o2=" + o2);
            return (o1<o2)? -1 : ((o1==o2) ? 0: 1)*-1;
        }
    }

}