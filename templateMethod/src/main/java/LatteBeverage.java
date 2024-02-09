import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class LatteBeverage extends HotBeverageWithHook {

    private int sugarSpoons;

    @Override
    public void brew() {
        System.out.println("Brewing Latte.");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding " + sugarSpoons + " sugar spoon(s) to the latte.");
    }

    protected boolean wantSomeCondiments() {
        return sugarSpoons >= 1;
    }
}

