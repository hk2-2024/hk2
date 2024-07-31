package generic.ex4;

import generic.animal.Animal;

public class ComplexBox<T extends Animal> {
    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public <T > T printAndReturn(T t) {
        System.out.println("animal.getClass() = " + animal.getClass().getName());
        System.out.println("t.getClass() = " + t.getClass().getName());
        //System.out.println("t.getName() = " + t.getName());
        return t;
    }
}
