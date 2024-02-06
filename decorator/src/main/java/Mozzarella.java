public class Mozzarella extends ToppingDecorator{

    public Mozzarella(Pizza basePizza) {
        super(basePizza);
    }

    @Override
    public double getCost() {
        return 2.50;
    }
}
