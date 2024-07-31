package collection.map.test;

import java.util.Deque;
import java.util.ArrayDeque;

public class SimpleHistoryTest {
    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();
        // 코드 작성

        stack.push("a");
        stack.push("b");
        stack.push("c");
        System.out.println("stack = " + stack);


        String str;
        str = stack.pop();
        System.out.println("stack = " + str);


        str = stack.pop();
        System.out.println("stack = " + str);

        str = stack.pop();
        System.out.println("stack = " + str);


    }
}
