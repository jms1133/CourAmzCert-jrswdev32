package activities.a0HashMapIntro;

import java.util.HashMap;

public class SongMap {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap map = new HashMap<>();

        // Adding songs as key-value pairs
        map.put("Satisfaction", "The Rolling Stones");
        map.put("Money", "Pink Floyd");
        map.put("The End", "The Doors");
        map.put("Deuce", "KISS");
        map.put("Jump", "Van Halen");
        map.put("Yesterday", "Ray Charles");

        // Print the song titles and artists
        // not ordered as entered, but for quick value retrieval
        System.out.println(map);
        // if same key added twice, replaced
    }
}
