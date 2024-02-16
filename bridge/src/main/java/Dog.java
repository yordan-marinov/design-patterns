public class Dog extends Animal{

    public Dog(AnimalSound animalSound) {
        super(animalSound);
    }

    @Override
    protected void greet() {
        System.out.print("I'm a Dog - ");
        animalSound.makeSound();
    }
}
