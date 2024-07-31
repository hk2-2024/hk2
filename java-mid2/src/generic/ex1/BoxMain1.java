package generic.ex1;

public class BoxMain1 {
    public static void main(String[] args) {
        IntegerBox integerBox = new IntegerBox();
        StringBox stringBox = new StringBox();
        integerBox.setValue(10);
        Integer integer = integerBox.getValue();
        System.out.println(integer);

        stringBox.setValue("hello");
        String str = stringBox.getValue();
        System.out.println(str);
    }

}
