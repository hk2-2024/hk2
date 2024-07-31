package collection.map.test;

import java.util.Deque;
import java.util.ArrayDeque;

public class BrowserHistory {
    Deque<String > stack = new ArrayDeque<>();

    public void visitPage(String site) {
        stack.push(site);
        System.out.println("visit " + site);

    }

    public String goBack() {
        stack.pop();
        String result = stack.peek();
        System.out.println("back " + result);
        return result;
    }
}
