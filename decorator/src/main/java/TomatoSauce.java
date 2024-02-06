public class TomatoSauce extends ToppingDecorator {

    private static final double COST = 1.00;
    private final String toppingName;
    public TomatoSauce(Pizza basePizza) {
        super(basePizza);
        this.toppingName = this.getClass().getSimpleName().toLowerCase();
    }

    @Override
    public String getDescription() {
        return String.format("%s, %s", basePizza.getDescription(), toppingName) ;
    }

    @Override
    public double cost() {
        return basePizza.cost() + COST;
    }
}
