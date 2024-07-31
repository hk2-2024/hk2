package generic.ex4;


import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {
    public static void main(String[] args) {
        Dog dog = new  Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 100);

        AnimalMethod.<Dog>checkup(dog);
        AnimalMethod.<Cat>checkup(cat);

        Dog targetDog = new Dog("큰 멍멍이", 200);
        Animal bigger = AnimalMethod.getBigger(dog, cat);
        System.out.println("bigger = " + bigger);
        System.out.println("AnimalMethod.getBigger(dog, cat) = " + AnimalMethod.getBigger(dog, cat));
    }
}
