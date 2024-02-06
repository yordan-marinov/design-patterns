import lombok.Data;

@Data
abstract public class ToppingDecorator implements Pizza{

    protected Pizza basePizza;

    public ToppingDecorator(Pizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public String getDescription() {
        return basePizza.getDescription();
    }

    @Override
    public double cost() {
        return basePizza.cost();
    }
}
