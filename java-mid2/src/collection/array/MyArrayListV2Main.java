package collection.array;

public class MyArrayListV2Main {
    public static void main(String[] args) {
        MyArrayListV1 list = new MyArrayListV1();

        System.out.println("==데이터 추가==");
        System.out.println(list);
        list.add("a");
        System.out.println(list);
        list.add("b");
        System.out.println(list);
        list.add("c");
        System.out.println(list);
        try {

            System.out.println("==기능 사용==");
            System.out.println("list.size(): " + list.size());
            System.out.println("list.get(1): " + list.get(1));
            System.out.println("list.indexOf('c'): " + list.indexOf("c"));
            System.out.println("list.set(2, 'z'), oldValue: " + list.set(2, "z"));
            System.out.println(list);

            System.out.println("==범위 초과==");
            list.add("d");
            System.out.println(list);
            list.add("e");
            System.out.println(list);
            //범위 초과, capacity가 늘어나지 않으면 예외 발생
            list.add("f");
            System.out.println(list);
        } catch (Exception e) {
            exceptionHandler(e);
            list.add("f");
            System.out.println(list);
        }
    }

    private static void exceptionHandler(Exception e) {
        System.out.println("system error "+ e.getMessage());
        e.printStackTrace(System.out);
        e.printStackTrace();

        if (e instanceof ArrayException s) {
            MyArrayListV1.grow();
            System.out.println("grow!!!");

        }

    }
}
