public class Cat extends Animal{

    public Cat(AnimalSound animalSound) {
        super(animalSound);
    }

    @Override
    protected void greet() {
        System.out.print("I'm a Cat - ");
        animalSound.makeSound();
    }
}
