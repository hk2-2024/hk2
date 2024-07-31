package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        Deque<Integer> deque = new ArrayDeque<>();

        deque.offer(1);
        deque.offer(2);
        deque.offer(3);
        deque.offerFirst(4);

        System.out.println(deque);

        System.out.println("queue.peek() = " + deque.peekLast());

        deque.poll();
        deque.pollFirst();
        System.out.println(deque);
        deque.pollLast();
        System.out.println(deque);
    }
}
