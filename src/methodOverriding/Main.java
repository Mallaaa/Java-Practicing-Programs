package methodOverriding;

public class Main {
    public static void main() {
        Animal animal = new Animal();
        Fish fish = new Fish();
        Dog dog = new Dog();

        fish.move();
        dog.move();
        System.out.println("this ois to string"+ animal.toString());

    }
}
