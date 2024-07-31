package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain1 {

    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        studentMap.put("studentA", 90);
        studentMap.put("studentB", 80);
        studentMap.put("studentC", 80);
        studentMap.put("studentD", 100);
        System.out.println(studentMap);

        Integer result = studentMap.get("studentD");
        System.out.println("result = " + result);

        System.out.println("Key set");
        Set<String > KeySet = studentMap.keySet();
        for (String key : KeySet) {
            Integer value = studentMap.get(key);
            System.out.println("key = " + key +" value = " + value);
        }

        System.out.println("entry");
        Set<Map.Entry<String, Integer>> enties = studentMap.entrySet();
        for(Map.Entry<String, Integer> entry : enties){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("key = " + key +" value = " + value);
        }

        System.out.println("value");
        Collection<Integer> values = studentMap.values();
        for(Integer value : values) {
            System.out.println("value = " + value);
        }

    }



}
