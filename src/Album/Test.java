public class Test {
    public static void main(String[] args) {
        // Assuming a Date class exists and is imported
        Date releaseDate1 = new Date(2022, 1, 1); // Example date
        Album album1 = new Album("Title1", "Artist1", "Genre1", releaseDate1);
        Album album2 = new Album("Title1", "Artist1", "Genre1", releaseDate1);
        Album album3 = new Album("Title2", "Artist2", "Genre2", releaseDate1);

        // Test getters
        System.out.println("Title: " + album1.getTitle());

        // Test setters
        album1.setRating(5);
        System.out.println("Rating: " + album1.getRating());

        // Test equals method
        System.out.println("Album1 equals Album2: " + album1.equals(album2)); // Expected: true
        System.out.println("Album1 equals Album3: " + album1.equals(album3)); // Expected: false

        // Test hashCode method
        System.out.println("HashCode Album1: " + album1.hashCode());
        System.out.println("HashCode Album2: " + album2.hashCode()); // Should match Album1's hashCode if they are equal
    }
}
