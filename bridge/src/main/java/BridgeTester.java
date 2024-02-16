public class BridgeTester {

    public static void main(String[] args) {
        final Dog dog = new Dog(new DogSound());
        final Cat cat = new Cat(new CatSound());

        dog.greet();
        cat.greet();
    }
}
