package animal;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import nutrition.Nutrition;

@ToString
@Getter
@EqualsAndHashCode(callSuper = false)
public abstract class Animal {

    private final String name;
    private final String kind;
    private Nutrition nutritionType;

    public Animal(String name, String kind, Nutrition nutritionType) {
        this.name = name;
        this.kind = kind;
        this.nutritionType = nutritionType;
    }

    public void getMeal() {
        nutritionType.eat();
    }

    public void changeDiet(Nutrition otherNutrition) {
        nutritionType = otherNutrition;
    }
}
