import animal.Animal;
import animal.Bird;
import animal.Cat;
import nutrition.Nutrition;
import nutrition.Predator;
import nutrition.Prey;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class AnimalTest {

    private Nutrition prey;

    private static  final String LION_NAME = "Kitty";
    private static final String LION_KIND = "Lion";
    private static  final String BIRD_NAME = "Tweety";
    private static final String BIRD_KIND = "Bird";
    private Animal lion;
    private Animal bird;
    @BeforeEach
    void setUp() {
        Nutrition predator = new Predator();
        prey = new Prey();
        lion = new Cat(LION_NAME, LION_KIND, predator);
        bird = new Bird(BIRD_NAME, BIRD_KIND, prey);
    }

    @Test
    public void test_InitializeAnimal() {
        assertThat(lion).isInstanceOf(Animal.class);
        assertThat(lion.getName()).isEqualTo(LION_NAME);
        assertThat(lion.getKind()).isEqualTo(LION_KIND);
    }

    @Test
    public void test_AnimaFeed() {
        final Nutrition mockedNutrition = Mockito.mock(Prey.class);
        lion.changeDiet(mockedNutrition);
        lion.getMeal();
        verify(mockedNutrition).eat();
    }

    @Test
    public void test_changeDiet() {
        assertThat(lion.getNutritionType()).isInstanceOf(Predator.class);
        lion.changeDiet(prey);
        assertThat(lion.getNutritionType()).isInstanceOf(Prey.class);
    }

}