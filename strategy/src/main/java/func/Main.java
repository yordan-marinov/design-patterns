package func;

public class Main {

    public static void main(String[] args) {


        final Basket basket = new Basket();
        System.out.println(basket.total(Offers.WEEKENDS.getOffer()));
    }
}
