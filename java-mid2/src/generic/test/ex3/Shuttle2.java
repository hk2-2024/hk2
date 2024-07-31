package generic.test.ex3;

public class Shuttle2<T extends BioUnit> {
    private T value;

    public void in(T t) {
        this.value = t;
    }

    public T out() {
        return value;
    }

    public void showInfo() {
        System.out.println("value.getName() = " + value.getName());
        System.out.println("value.getHp() = " + value.getHp());
    }
}
