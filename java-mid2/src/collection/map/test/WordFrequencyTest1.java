package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest1 {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";

        Map<String, Integer> map = new HashMap<>();
        String[] splitStr = text.split(" ");
        for (String s : splitStr) {
/*
            Integer i = map.get(s);
            if (i == null) {
                map.put(s, 1);
            } else {
                i += 1;

                System.out.println("i = " + i);
                map.put(s, i);
            }*/

            map.put(s, map.getOrDefault(s, 0) + 1);
            System.out.println("map = " + map);

        }
        System.out.println("map = " + map);


    }

}
