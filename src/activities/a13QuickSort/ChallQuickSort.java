package activities.a13QuickSort;

public class ChallQuickSort {

    private static void quickSortString(String[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high); // pivot variable

            quickSortString(arr, low, pi-1);
            quickSortString(arr, pi+1, high);
        }
    }

    private static int partition(String[] arr, int low, int high) {
        String pivot = arr[high];
        int i = low - 1;
        for ( int j = low; j<high; j++){
            if (arr[j].compareTo(pivot) <= 0){
                i++;
                String temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        String temp = arr[i + 1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }


    public static void main(String[] args) {
        String[] words = {"banana", "apple", "orange", "kiwi", "grape"};
        quickSortString(words, 0, words.length-1);
        System.out.print("Sorted numbers: ");
        for (String word : words) {
            System.out.print(word + " ");
        }
    }


}
