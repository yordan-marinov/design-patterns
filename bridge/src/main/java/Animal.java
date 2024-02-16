import lombok.AllArgsConstructor;

@AllArgsConstructor
abstract public class Animal {

    protected final AnimalSound animalSound;

    abstract protected void greet();
}
