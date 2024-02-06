public class TomatoSauce extends ToppingDecorator {

    public TomatoSauce(Pizza basePizza) {
        super(basePizza);
    }

    @Override
    public double getCost() {
        return 1.00;
    }
}
