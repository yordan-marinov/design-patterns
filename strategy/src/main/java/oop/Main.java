package oop;

import oop.animal.Animal;
import oop.animal.Cat;
import oop.nutrition.Nutrition;
import oop.nutrition.Predator;
import oop.nutrition.Prey;

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
