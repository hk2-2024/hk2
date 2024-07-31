package collection.set;

public class MyHashSetMain {
    public static void main(String[] args) {
        MyHashSetV1 set = new MyHashSetV1();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        System.out.println(set);

        boolean result = set.add(4);
        System.out.println("result = " + result);
        System.out.println(set);

        System.out.println("set.contains(3) = " + set.contains(3));
        System.out.println("set.contains(99) = " + set.contains(99));
    }
}
