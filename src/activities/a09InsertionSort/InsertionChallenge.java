package activities.a09InsertionSort;

public class InsertionChallenge {
    public static void main(String[] args) {
        String[] names = {"Augusta", "Ria", "Jodee", "Sophia", "James"};
        insertionSortDescending(names);

        System.out.print("Sorted names in reverse order: ");
        for (String name : names) {
            System.out.print(name + " ");
        }
    }

    public static void insertionSortDescending(String[] arr) {
        //TODO: Write the logic to sort the names in descending order
    }
}
