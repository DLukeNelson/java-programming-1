
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }
    
    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        
        if (!(other instanceof Song)) {
            return false;
        }
        
        Song that = (Song) other;
        
        return this.artist.equals(that.artist)
                && this.name.equals(that.name)
                && this.durationInSeconds == that.durationInSeconds;
    }


}
