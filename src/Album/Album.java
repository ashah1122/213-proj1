/**
 * @author aeshashah
 */
import java.util.Objects;

/**
 * Represents a music album with properties for title, artist, genre, release date, and rating.
 */
public class Album {
    private String title;
    private String artist;
    private String genre;
    private Date releaseDate;
    private int rating;

    /**
     * Constructs a new Album instance.
     *
     * @param title Gives the title of the album.
     * @param artist Gives the artist of the album.
     * @param genre Gives the genre of the album.
     * @param releaseDate Gives the release date of the album.
     */
    public Album(String title, String artist, String genre, Date releaseDate) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.rating = 0; // Initialize with default rating (assuming rating is optional at creation)
    }

    // Getters
    public String getTitle() { return title; }
    public String getArtist() { return artist; }
    public String getGenre() { return genre; }
    public Date getReleaseDate() { return releaseDate; }
    public int getRating() { return rating; }

    // Setters
    public void setTitle(String title) { this.title = title; }
    public void setArtist(String artist) { this.artist = artist; }
    public void setGenre(String genre) { this.genre = genre; }
    public void setReleaseDate(Date releaseDate) { this.releaseDate = releaseDate; }
    public void setRating(int rating) { this.rating = rating; }

    /**
     * Checks if this album is equal to another object. They are considered equal if they have the same title and artist.
     *
     * @param o The object to compare this album against.
     * @return true if the given object represents an Album equivalent to this album, false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Album)) return false;
        Album album = (Album) o;
        return title.equals(album.title) && artist.equals(album.artist);
    }

    /**
     * Returns a hash code value for the album.
     *
     * @return a hash code value for this album.
     */
    @Override
    public int hashCode() {
        return Objects.hash(title, artist);
    }
    @Override
    public String toString() {
        // Assuming rating is an integer count of 1-star ratings
        String ratingStars = "*".repeat(Math.max(0, rating)); // Use the repeat method to generate a string of asterisks
        return String.format("%s by %s, %s, %s, %s", title, artist, genre, releaseDate.toString(), ratingStars.isEmpty() ? "(No Ratings)" : ratingStars);
    }


}
