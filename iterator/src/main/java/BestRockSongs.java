import java.util.ArrayList;
import java.util.Iterator;


public class BestRockSongs implements SongIterator{

    ArrayList<SongInfo> theBestRock;

    public BestRockSongs(ArrayList<SongInfo> theBestRock) {
        this.theBestRock = theBestRock;
    }

    @Override
    public Iterator<SongInfo> getIterator() {
        return theBestRock.iterator();
    }
}
