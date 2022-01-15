package animal;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        Dog dog = new Dog();
        AnimalDemo animalDemo = new AnimalDemo();
        System.out.println("Animal");
        animalDemo.help(animal);
        System.out.println("Cat");
        animalDemo.help(cat);
        System.out.println("Dog");
        animalDemo.help(dog);
    }

    private void help(Animal animal) {
        animal.makeVoice();

    }
}
