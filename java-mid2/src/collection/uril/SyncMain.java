package collection.uril;

import java.util.*;

public class SyncMain {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("list.getClass() = " + list.getClass());
        List<Integer> syncList = Collections.synchronizedList(list);
        System.out.println(syncList.getClass());

        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(1);
        Deque<Integer> queue2 = new ArrayDeque<>();
        queue2.push(1);
    }
}
