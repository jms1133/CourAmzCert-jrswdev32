package activities.a12MergeSort;

public class MergeSortImplementation {
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            // Recursively divide the array
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);

            // Merge the sorted halves
            merge(arr, left, middle, right);
        }
    }

    public static void merge(int[] arr, int left, int middle, int right) {
        // size of the subarrays
        int n1 = middle - left + 1;
        int n2 = right - middle;

        // create subarrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // copy elements to subarrays
        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[middle + 1 + j];
        }

        //  Initialize indexes for the subarrays and the merged array
        int i = 0, j = 0, k = left;

        // while not all traversed
        while (i < n1 && j < n2) {
            // add smallest
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // after a subarray is full traversed, traverse the other one
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

}
