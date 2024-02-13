public abstract class SongComponent {
    // We throw UnsupportedOperationException so that if
    // it doesn't make sense for a song, or song group
    // to inherit a method they can just inherit the
    // default implementation

    public void add(SongComponent songComponent) {
        throw new UnsupportedOperationException("Adding a song is not supported");
    }

    public void remove(SongComponent songComponent) {
        throw new UnsupportedOperationException("Removing is not supported");
    }

    public SongComponent getComponent(int componentIndex) {
        throw new UnsupportedOperationException();
    }

    public String getSongName() {
        throw new UnsupportedOperationException();
    }

    public String getSongBand() {
        throw new UnsupportedOperationException();
    }


    public int getReleasedYear() {
        throw new UnsupportedOperationException();
    }

    public void displaySongInfo() {
        throw new UnsupportedOperationException();
    }
}
