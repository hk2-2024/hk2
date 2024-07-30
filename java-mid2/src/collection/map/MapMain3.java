package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain2 {
    public static void main(String[] args) {
        Map<String, Integer> stringIntegerMap = new HashMap<>();

        stringIntegerMap.put("A", 90);
        System.out.println(stringIntegerMap);

        stringIntegerMap.put("A", 80);
        System.out.println(stringIntegerMap);

        boolean containsKey = stringIntegerMap.containsKey("A");
        System.out.println("containsKey = " + containsKey);

        stringIntegerMap.remove("A");
        System.out.println(stringIntegerMap);
    }
}
