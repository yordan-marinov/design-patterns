import java.util.Arrays;
import java.util.Iterator;

public class BestHipHopSongs implements SongIterator {

    SongInfo[] theBest;

    public BestHipHopSongs(SongInfo[] songInfos) {
        this.theBest = songInfos;
    }

    @Override
    public Iterator<SongInfo> getIterator() {
        return Arrays.stream(theBest).iterator();
    }
}
