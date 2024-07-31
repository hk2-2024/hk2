package generic.test.ex3;

public class ShuttleTest {
    public static void main(String[] args) {
        Shuttle2<Marine> shuttle1 = new Shuttle2<>();
        shuttle1.in(new Marine("마린", 40));
        shuttle1.showInfo();

        Shuttle2<Zergling> shuttle2 = new Shuttle2<>();
        shuttle2.in(new Zergling("저글링", 35));
        shuttle2.showInfo();

        Shuttle2<Zealot> shuttle3 = new Shuttle2<>();
        shuttle3.in(new Zealot("질럿", 100));
        shuttle3.showInfo();
    }
}
