package generic.ex3;


import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV1 {
    public static void main(String[] args) {
        AnimalHospital dogHospital = new AnimalHospital();
        AnimalHospital catHospital = new AnimalHospital();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);

        dogHospital.set(dog);
        dogHospital.checkup();


        catHospital.set(cat);
        catHospital.checkup();

        dogHospital.set(cat);
        Animal biggerDog = dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);


        dogHospital.set(dog);
        Dog biggerDog2 = (Dog)dogHospital.bigger(new Dog("멍멍이2", 200));

        System.out.println("biggerDog = " + biggerDog2);
    }
}
