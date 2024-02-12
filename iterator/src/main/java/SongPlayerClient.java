import java.util.ArrayList;

public class SongPlayerClient {

    private static final ArrayList<SongInfo> theBestRock = new ArrayList<>();
    private static final SongInfo[] theBestHipHop = new SongInfo[3];


    public static void main(String[] args) {
        theBestRock.add(new SongInfo("Whole Lotta Love", "Led Zeppelin", 1969));
        theBestRock.add(new SongInfo("Smells Like Teen Spirit", "Nirvana", 1991));
        theBestRock.add(new SongInfo("I Can't Get No Satisfaction", "The Rolling Stones", 1965));

        theBestHipHop[0] = new SongInfo("Paul Revere", "Beastie Boys", 1986);
        theBestHipHop[1] = new SongInfo("Lose Yourself", "Eminem", 2002);
        theBestHipHop[2] = new SongInfo("Fight the Power", "Public Enemy", 1989);

        SongPlayer mySongPlayer = new SongPlayer(
                new BestRockSongs(theBestRock),
                new BestHipHopSongs(theBestHipHop)
        );

        mySongPlayer.playRock();
        mySongPlayer.playHipHop();

    }
}
