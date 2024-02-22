package func;

import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.IntStream;

public class Basket {

    private static final Function<Integer, Integer> FUNCTION = i -> (int) (i * (1 - 0.9));
    private final IntStream items = IntStream.range(1, 5);

    public int total(UnaryOperator<Integer> offer) {
        return offer.andThen(i -> (int) (i * (1 - 0.5))).apply(this.items.sum());
    }


//    final Function<Integer, Integer> off = integer -> (int) integer;
//    final Function<Integer, Integer> tenOff = integer -> (int) (integer * (1 - 0.1));
//    final Function<Integer, Integer> fifteenOff = integer -> (int) (integer * (1 - 0.15));
//    final Function<Integer, Integer> twentyOff = integer -> (int) (integer * (1 - 0.2));
//
//
//    private final Function<Offers, Function<Integer, Integer>> promotionsStrategy = p-> {
//        final EnumMap<Offers, Function<Integer, Integer>> promsMap = new EnumMap<>(Offers.class);
//        promsMap.put(Offers.NO, off);
//        promsMap.put(Offers.WEEKENDS, tenOff);
//        promsMap.put(Offers.BLACK_FRIDAY, fifteenOff);
//        promsMap.put(Offers.CHRISTMAS, twentyOff);
//        return promsMap.get(p);
//    };
}
