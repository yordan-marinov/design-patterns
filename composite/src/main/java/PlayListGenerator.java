public class PlayListGenerator {

    public static void main(String[] args) {

        final SongPlaylist bestOfRock = new SongPlaylist("Best of Rock", "Rock playlist design to contain very best of the rock music of all time");
        final SongPlaylist bestOfHipHop = new SongPlaylist("Best of Hip Hop", "Hip Hop playlist design to contain very best of the hip hop music of all time");
        final SongPlaylist myPlayList = new SongPlaylist("My Playlist", "Contains songs of different styles");

        bestOfRock.add(new Song("Whole Lotta Love", "Led Zeppelin", 1969));
        bestOfRock.add(new Song("Smells Like Teen Spirit", "Nirvana", 1991));
        bestOfRock.add(new Song("I Can't Get No Satisfaction", "The Rolling Stones", 1965));

        bestOfHipHop.add(new Song("Paul Revere", "Beastie Boys", 1986));
        bestOfHipHop.add(new Song("Lose Yourself", "Eminem", 2002));
        bestOfHipHop.add(new Song("Fight the Power", "Public Enemy", 1989));

        myPlayList.add(new Song("Killing in the Name", "Rage Against the Machine", 1992));
        myPlayList.add(new Song("Ace of Spades", "Motorhead", 1980));
        myPlayList.add(new Song("War Pigs", "Black Sabbath", 1970));

        final SongPlaylist allSongs = new SongPlaylist("All Songs", "All of the Songs");
        allSongs.add(new Song("Master of Puppets", "Metallica", 1986));
        allSongs.add(myPlayList);
        allSongs.add(bestOfRock);
        allSongs.add(bestOfHipHop);

        final SongPlayer player = new SongPlayer(allSongs);
        player.play();
    }
}
