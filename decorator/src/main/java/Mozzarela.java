import java.util.Locale;

public class Mozzarela extends ToppingDecorator{

    private static final double COST = 2.50;
    private final String toppingName;
    public Mozzarela(Pizza basePizza) {
        super(basePizza);
        this.toppingName = this.getClass().getSimpleName().toLowerCase();
    }
    @Override
    public String getDescription() {
        return String.format("%s, %s", basePizza.getDescription(), toppingName);
    }

    @Override
    public double cost() {
        return basePizza.cost() + COST;
    }

}
