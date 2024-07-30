package generic.test.ex3;

public class Shuttle <T extends BioUnit>{
    private T value;

    public void in(T t) {
        value = t;
    }
    public T get() {
        return value;
    }

    public void showInfo() {
        System.out.println(value.getName() +" "+ value.getHp());
    }
}
