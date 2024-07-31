package generic.test.ex2;

public class Pair<T, S> {
    private T valueT;
    private S valueS;

    public void setFirst(T value) {
        this.valueT = value;
    }

    public void setSecond(S value) {
        valueS = value;
    }

    public T getFirst() {
        return valueT;
    }

    public S getSecond() {
        return valueS;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "valueT=" + valueT +
                ", valueS=" + valueS +
                '}';
    }
}
