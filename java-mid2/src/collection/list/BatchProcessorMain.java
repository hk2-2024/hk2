package collection.list;

import java.util.ArrayList;
import java.util.LinkedList;

public class BatchProcessorMain {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
//        MyLinkedList<Integer> list = new MyLinkedList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
//        LinkedList<Integer> list1 = new LinkedList<>();

        BatchProcessor processor = new BatchProcessor(list);
        processor.logic(50_000);

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
//            E i2 = Integer.valueOf(i);
//            list1.add(0, i); //앞에 추가
            list1.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("size : "+50000+" "+ (endTime-startTime));
        System.out.println("list1.get(40000) = " + list1.get(40000));
    }
}
