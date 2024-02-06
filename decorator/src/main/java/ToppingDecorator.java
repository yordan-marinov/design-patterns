import lombok.Data;

@Data
abstract public class ToppingDecorator implements Pizza{

    protected Pizza basePizza;
    private final String toppingName;
    private final double cost;


    public ToppingDecorator(Pizza basePizza) {
        this.basePizza = basePizza;
        this.toppingName = this.getClass().getSimpleName().toLowerCase();
        this.cost = this.getCost();
    }

    @Override
    public String getDescription() {
        return String.format("%s, %s", basePizza.getDescription(), toppingName);
    }

    @Override
    public double cost() {
        return basePizza.cost() + cost;
    }
}
