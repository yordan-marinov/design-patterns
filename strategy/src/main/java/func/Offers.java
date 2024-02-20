package func;

import lombok.Getter;

import java.util.function.UnaryOperator;

@Getter
public enum Offers {
    NO(i -> i),                                 // No % Off
    BLACK_FRIDAY(i -> (int) (i * (1 - 0.1))),   // 10% Off
    CHRISTMAS(i -> (int) (i * (1 - 0.15))),     // 15% Off
    WEEKENDS(i -> (int) (i * (1 - 0.2)));       // 20% Off

    public final UnaryOperator<Integer> offer;

    Offers(UnaryOperator<Integer> offer) {
        this.offer = offer;
    }
}
