import animal.Animal;
import animal.Cat;
import nutrition.Nutrition;
import nutrition.Predator;
import nutrition.Prey;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        Nutrition prey = new Prey();
        Nutrition predator = new Predator();

        Animal kitty = new Cat("Kitty", "Lion", predator);
        kitty.getMeal();
        kitty.changeDiet(prey);
        kitty.getMeal();
    }
}
