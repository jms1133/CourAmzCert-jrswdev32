package activities.a05TreeMapBasicOp;

import java.util.TreeMap;

public class TreeMapNavigation {
    public static void main(String[] args) {

        TreeMap treeMap = new TreeMap();

        treeMap.put(3.75, "John");
        treeMap.put((double)4, "Zina");
        treeMap.put(3.00, "David");
        treeMap.put(3.25, "Antonio");
        treeMap.put(3.5, "Alen");

        System.out.println(treeMap);

        Object lowestGPA = treeMap.firstKey();
        Object name = treeMap.get(lowestGPA);
        System.out.println("Lowest GPA: " + lowestGPA + ": " + name);

        Object highestGPA = treeMap.lastKey();
        name = treeMap.get(highestGPA);
        System.out.println("Highest GPA: " + highestGPA + ": " + name);

        double higherThan = 3.6;
        Object higherGPA = treeMap.higherKey(higherThan);
        System.out.println(higherGPA + " is higher than " + higherThan);
    }

}
