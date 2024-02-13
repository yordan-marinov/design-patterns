import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SongPlayer {

    private SongComponent songComponent;

    public void play() {
        songComponent.displayComponentInfo();
    }
}
