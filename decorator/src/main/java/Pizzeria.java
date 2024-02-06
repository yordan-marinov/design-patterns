import java.text.DecimalFormat;

public class Pizzeria {

    public static void main(String[] args) {
        // Making the base case "Plain Pizza"
        Pizza plainPizza = new PlainPizza();
        // Adding different toppings to the plain pizza
        final ToppingDecorator tomatoSauce = new TomatoSauce(plainPizza);
        final Mozzarella doubleMozzarella = new Mozzarella(new Mozzarella(tomatoSauce));

        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println(
                String.format("You choose [%s] pizza for: $%s",
                        doubleMozzarella.getDescription(),
                        df.format(doubleMozzarella.cost())
                )
        );
    }
}
