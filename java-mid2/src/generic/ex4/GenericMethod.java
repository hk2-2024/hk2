package generic.ex4;

public class GenericMethod {

    public static Object objMethod(Object obj) {
        System.out.println("obj = " + obj);
        return obj;
    }

    public static <T> T genericMethodI(T t) {
        System.out.println("generic  = " + t);
        return t;
    }
    public static <T extends Number> T numberMethod(T t) {
        System.out.println("bound = " + t);
        return t;
    }
}
