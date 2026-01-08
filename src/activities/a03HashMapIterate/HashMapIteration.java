package activities.a03HashMapIterate;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapIteration {
    public static void main(String[] args) {

        // Iterating using keySet():
        // keySet(): Iterates through the keys and retrieves values using the get() method.
        // entrySet(): Iterates through the key-value pairs directly.

        Map<String, String> map = new HashMap<>();

        map.put("LY2048303", "John Wells");
        map.put("AB0649858", "Lori Wells");
        map.put("AB4453455", "David Windston");
        map.put("CS9857859", "John Smith");
        map.put("LY9475958", "Alen Cornworth");

        System.out.println();

        Set<String> keys = map.keySet();
        System.out.println("Using keySet()");
        for (String key : keys) {
            String value = map.get(key);
            System.out.println("ID: " + key + ", NAME: " + value);
        }
        System.out.println();

        // The statement Map map = new HashMap() creates a HashMap instance while referencing it through the Map interface.
        // By coding to the Map interface, you're following a principle of programming to an interface, not an implementation, which promotes flexibility and abstraction.
        // This means you can switch to another Map implementation (like TreeMap, LinkedHashMap, etc.) without changing the rest of your code.
        HashMap hashMap = new HashMap();
        hashMap.put("LY2048303", "John Wells");
        hashMap.put("AB0649858", "Lori Wells");
        hashMap.put("AB4453455", "David Windston");
        hashMap.put("CS9857859", "John Smith");
        hashMap.put("LY9475958", "Alen Cornworth");

        Set keys2 = hashMap.keySet();
        System.out.println("Using keySet()");
        for (Object key : keys2) {
            Object value = hashMap.get(key);
            System.out.println("ID: " + key + ", NAME: " + value);
        }
    }
}
