package generic.test.ex3;

public class UnitPrinter {
//    static <T extends Animal> void printGenericV2(Box<T> box)
    static <T extends BioUnit> void printV1(Shuttle<T> t) {
        T t1 = t.get();
        System.out.println(t1.getName() +" "+ t1.getHp());
//       System.out.println(t.showInfo() +" "+ t.showInfo());
//        t.showInfo();
    }

    static <T extends BioUnit> void printV2(Shuttle<? extends BioUnit> t) {
        t.showInfo();
    }

}
