package basic.oop;

import animal.Animal;
import animal.AnimalDemo;
import animal.Dog;

public class Parsing {
    public static void main(String[] args) {
        Animal animal = new Dog();
        Dog dog = (Dog) animal;
    }
}
