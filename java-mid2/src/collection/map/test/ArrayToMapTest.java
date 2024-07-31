package collection.map.test;

import java.util.*;

public class ArrayToMapTest {
    public static void main(String[] args) {
        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"}, {"JPA","30000"}};
        // 주어진 배열로부터 Map 생성 - 코드 작성
        Map<String, Integer> map = new HashMap<>();

        for (String[] s : productArr) {
            map.put(s[0], Integer.valueOf(s[1]));
        }
        System.out.println("map = " + map);
        Set<String> keySet = map.keySet();
        for (String value : keySet) {
            System.out.print(value);
            System.out.println(" "+ map.get(value));
        }
        /*
        Iterator<String> iter = keySet.iterator();
        while (iter.hasNext()) {
            String value = iter.next();
            System.out.println(value);
            System.out.println(map.get(value));
        }*/
    }

}
