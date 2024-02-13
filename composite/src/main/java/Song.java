import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Song extends SongComponent {
    private String name;
    private String band;
    private int releasedYear;

    @Override
    public void displayComponentInfo() {
        System.out.println("\t" + this.name + " by " + this.band + " released in " + this.releasedYear + " year");
    }
}
