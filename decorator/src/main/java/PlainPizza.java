import lombok.Data;

@Data
public class PlainPizza implements Pizza {

    public static final String PLAIN_PIZZA = "Plain Pizza";
    public static final double COST = 10.99;

    @Override
    public String getDescription() {
        return PLAIN_PIZZA;
    }

    @Override
    public double cost() {
        return COST;
    }
}
