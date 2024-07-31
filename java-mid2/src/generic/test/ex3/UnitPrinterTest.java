package generic.test.ex3;

public class UnitPrinterTest {
    public static void main(String[] args) {
        Shuttle2<Marine> shuttle1 = new Shuttle2<>();
        shuttle1.in(new Marine("마린", 40));

        Shuttle2<Zergling> shuttle2 = new Shuttle2<>();
        shuttle2.in(new Zergling("저글링", 35));

        Shuttle2<Zealot> shuttle3 = new Shuttle2<>();
        shuttle3.in(new Zealot("질럿", 100));

        UnitPrinter2.printV1(shuttle1);
        UnitPrinter2.printV2(shuttle1);
    }
}
