import lombok.Getter;

import java.util.ArrayList;
import java.util.Iterator;

@Getter
public class SongPlaylist extends SongComponent {

    private final ArrayList<SongComponent> songPlaylists = new ArrayList<>();
    private final String songPlaylistName;
    private final String playlistDescription;

    public SongPlaylist(String songPlaylistName, String playlistDescription) {
        this.songPlaylistName = songPlaylistName;
        this.playlistDescription = playlistDescription;
    }

    @Override
    public void add(SongComponent songComponent) {
        songPlaylists.add(songComponent);
    }

    @Override
    public void remove(SongComponent songComponent) {
        songPlaylists.remove(songComponent);
    }

    @Override
    public SongComponent getComponent(int componentIndex) {
        return songPlaylists.get(componentIndex);
    }

    @Override
    public void displayComponentInfo() {
        System.out.println("\n" + getSongPlaylistName() + " - " + getPlaylistDescription());
        final Iterator<SongComponent> componentIterator = songPlaylists.iterator();
        while (componentIterator.hasNext()) {
            // Cycles recursively through and prints any Song or Playlist added
            componentIterator.forEachRemaining(SongComponent::displayComponentInfo);
        }
    }
}



