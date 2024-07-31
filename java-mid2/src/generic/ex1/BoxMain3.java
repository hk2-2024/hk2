package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<Integer>();
        integerBox.set(10);

        Integer integer = integerBox.get();
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox  =new GenericBox<>();
        stringBox.set("hello");
        String str = stringBox.get();
        System.out.println("str = " + str);

        GenericBox<Double> doubleBox = new GenericBox<>();
        doubleBox.set(10.2);
        Double dValue = doubleBox.get();
        System.out.println("dValue = " + dValue);


    }
}