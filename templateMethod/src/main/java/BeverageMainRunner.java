public class BeverageMainRunner {

    public static void main(String[] args) {
        HotBeverageWithHook noSugarlatte = new LatteBeverage();
        noSugarlatte.prepare();

        System.out.println("-----------------------------------");

        HotBeverageWithHook sugarlatte = new LatteBeverage(3);
        sugarlatte.prepare();
    }
}
