package generic.test.ex3;

public class UnitPrinter2 {

    public static <T extends BioUnit> void printV1(Shuttle2<T> shuttle2) {
        T t = shuttle2.out();
        System.out.println("t.getName() = " + t.getName());
        System.out.println("t.getHp() = " + t.getHp());
    }

    public static <T extends BioUnit> void printV2(Shuttle2<? extends BioUnit> shuttle2) {
        BioUnit t = shuttle2.out();
        System.out.println("t.getName() = " + t.getName());
        System.out.println("t.getHp() = " + t.getHp());

    }
}
