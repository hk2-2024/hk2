package collection.set.javaset;

import java.util.*;


public class JavaSetMain {

    public static void main(String[] args) {
       /* Set<String > hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();*/

        run(new HashSet<String>());
        run(new LinkedHashSet<>());
        run(new TreeSet<>());

    }

    public static void run(Set<String> set) {
        System.out.println("set = " + set.getClass());
        set.add("C");
        set.add("B");
        set.add("A");
        set.add("1");
        set.add("2");

        System.out.println(set);

        Iterator<String > iter = set.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next());
        }
        System.out.println();

    }




}
