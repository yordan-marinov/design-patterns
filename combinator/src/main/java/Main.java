public class Main {

    public static void main(String[] args) {

        final var spongeBob = new Customer("Sponge Bob", "00786541231", "spongy@gmail.com");

        final var result = CustomerPurchaseValidator.isNameValid()
                .andThen(CustomerPurchaseValidator.isPhoneValid())
                .andThen(CustomerPurchaseValidator.isEmailValid())
                .apply(spongeBob);

        System.out.println(result);
    }
}
