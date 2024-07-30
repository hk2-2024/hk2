package collection.array;

public class MyArrayListV3Main {
    public static void main(String[] args) {
        MyArrayListV3 list = new MyArrayListV3();

        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        list.add(2, "add List");
        System.out.println(list);

        list.add(0, "add first");
        System.out.println(list);

        Object removed1 = list.remove(2);
        System.out.println("removed4 = " + removed1);
        System.out.println(list);

        Object removed2 = list.remove(0);
        System.out.println("removed0 = " + removed2);
        System.out.println(list);


    }


}
