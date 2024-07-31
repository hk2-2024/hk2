package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain3 {
    public static void main(String[] args) {
        Map<String, Integer> stringIntegerMap = new HashMap<>();

        stringIntegerMap.put("A", 100);
        System.out.println(stringIntegerMap);

        if (stringIntegerMap.containsKey("A")) {
            System.out.println("already");

        } else {

            stringIntegerMap.put("B", 100);
            System.out.println(stringIntegerMap);
        }

        stringIntegerMap.putIfAbsent("A",90);
        stringIntegerMap.putIfAbsent("B", 30);
        System.out.println(stringIntegerMap);
    }
}
