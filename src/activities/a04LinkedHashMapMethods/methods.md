# LinkedHashMap 
Offers the efficiency of a HashMap and maintains a consistent order of elements. 
Useful when predictable iteration order is required, (insertion-order or access-order)

## LinkedHashMap
- Maintains insertion order: The order in which elements are added is preserved.
- Supports null values and keys: Like HashMap, it allows one null key and multiple null values.
- Provides predictable iteration: Iteration order can be based on insertion or access.

## core methods of LinkedHashMap
1. `put(key, value)`
    This method associates the specified value with the specified key in the map. 
    If the map previously contained a mapping for the key, the old value is replaced
- Insertion Order: By default, LinkedHashMap maintains the order in which the entries are inserted. When you call put(K key, V value), the new entry is added at the end of the map, preserving the insertion order. If the key already exists, its value is updated, but its position in the map remains the same.
- Access Order (If enabled): If the LinkedHashMap is constructed with access-order mode (LinkedHashMap(boolean accessOrder)), calling put() or accessing a key (e.g., get()) moves the entry to the end of the map, making it the most recently used. This access order can be helpful to for cache implementations.
```java
import java.util.LinkedHashMap;
public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> studentScores = new LinkedHashMap<>();
        // Adding entries to the LinkedHashMap
        studentScores.put("Alice", 85);
        studentScores.put("Bob", 90);
        studentScores.put("Charlie", 78);
        System.out.println("Student Scores: " + studentScores);
    }
}
```

2. `get(Object key)`
   This method returns the value to which the specified key is mapped, or null if this map does not contain a mapping for the key.
```java
int score = studentScores.get("Bob");
System.out.println("Bob's Score: " + score);
// Bob's Score: 90
```
3. `remove(Object key)`
```java
studentScores.remove("Charlie");
System.out.println("After removing Charlie: " + studentScores);
// After removing Charlie: {Alice=85, Bob=90}
```
4. `containsKey(Object key)
This method returns true if the map contains a mapping for the specified key.
```java
boolean hasAlice = studentScores.containsKey("Alice");
System.out.println("Is Alice in the list? " + hasAlice);
```
5. `entrySet()`
This method returns a Set view of the mappings contained in this map. This is useful for iterating through the key-value pairs. 
This "Set view" is a collection that represents the map's entries (Map.Entry<K, V>), where each element in the set corresponds to a key-value pair.
```java
for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
    System.out.println(entry.getKey() + "'s Score: " + entry.getValue());
}
Alice's Score: 85

Bob's Score: 90
```
6. `putIfAbsent(K key, V value)`
This method associates the specified value with the specified key if the key is not already associated with a value.
```java
studentScores.putIfAbsent("David", 92);
System.out.println("After adding David: " + studentScores);
//After adding David: {Alice=85, Bob=90, David=92}
```

7. 