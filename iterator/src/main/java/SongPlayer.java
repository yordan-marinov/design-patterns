import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SongPlayer {

    private SongIterator bestRockSongs;
    private SongIterator bestHipHopSongs;

    public void playRock() {
        System.out.println("Playing the very best of the Rock music!!!");
        play(bestRockSongs);
    }

    public void playHipHop() {
        System.out.println("Playing the very best of the Hip-Hop music!!!");
        play(bestHipHopSongs);
    }

    private void play(SongIterator songIterator) {
        songIterator.getIterator().forEachRemaining(songInfo -> {
            System.out.println("\tSong name: " + songInfo.name());
            System.out.println("\tBand name : " + songInfo.band());
            System.out.println("\tReleased Year: " + songInfo.releasedYear() + "\n");
        });
    }
}
