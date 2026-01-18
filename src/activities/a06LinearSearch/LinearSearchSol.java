package activities.a06LinearSearch;

import java.util.ArrayList;
import java.util.List;
/*
To solve this challenge, first declare an ArrayList<Integer> named indices to store all the positions where the target value appears in the array.
Next, within the findAllOccurrences method, iterate through the array using a for loop. During each iteration, compare the current element to the target value. If the element matches the target value, use the add() method to store the index in the indices list.
After finishing the loop, convert the ArrayList to a standard integer array using the toArray() method with appropriate type conversion, returning the array of indices.
For the final step, print the result. Use a loop to print each index found or an appropriate message if no occurrences of the target value are found.
The following code demonstrates the solution:

 */
public class LinearSearchSol {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 20, 50};
        int target = 20;


        int[] indices = findAllOccurrences(arr, target);
        System.out.print("Find All Occurrences: ");
        if (indices.length > 0) {
            for (int index : indices) {
                System.out.print(index + " ");
            }
        } else {
            System.out.print("No occurrences found.");
        }
        System.out.println();
    }

    public static int[] findAllOccurrences(int[] arr, int target) {

        List<Integer> indicesList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                indicesList.add(i);
            }
        }

        int[] indicesArray = new int[indicesList.size()];
        for (int i = 0; i < indicesArray.length; i++) {
            indicesArray[i] = indicesList.get(i);
        }

        return indicesArray;
    }
}
