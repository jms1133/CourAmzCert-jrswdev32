package activities.a04LinkedHashMapMethods;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> studentScores = new LinkedHashMap<>();

        // Adding initial scores
        studentScores.put("Alice", 85);
        studentScores.put("Bob", 90);
        studentScores.put("Charlie", 78);

        // Displaying all scores
        System.out.println("Initial Scores:");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Updating Bob's score
        studentScores.put("Bob", 95);

        // Checking if Charlie is in the list
        if (studentScores.containsKey("Charlie")) {
            System.out.println("Charlie's score: " + studentScores.get("Charlie"));
        }

        // Removing Charlie from the list
        studentScores.remove("Charlie");

        // Adding a new student if not already present
        studentScores.putIfAbsent("David", 92);

        // Displaying the final scores
        System.out.println("\nFinal Scores:");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
