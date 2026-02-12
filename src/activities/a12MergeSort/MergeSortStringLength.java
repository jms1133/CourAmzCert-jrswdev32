package activities.a12MergeSort;

import java.util.Arrays;

public class MergeSortStringLength {
    public static void main(String[] args) {
        String[] fruits = {"apple", "banana", "kiwi", "grapefruit", "pear", "orange"};
        System.out.println(Arrays.toString(fruits));
        mergeString(fruits);
        System.out.println(Arrays.toString(fruits));
    }

    private static void mergeString(String[] fruits) {
        mergeString(fruits, 0, fruits.length-1);
    }

    private static void mergeString(String[] arr, int left, int right) {
        if ( left >= right) return;
        int middle = (left + right)/2;

        mergeString(arr, left, middle);
        mergeString(arr, middle+1, right);
        merge(arr, left, middle, right);
    }

    private static void merge(String[] arr, int left, int middle, int right) {
        // size of sub-arrays
        int n1 = middle - left + 1;
        int n2 = right - middle;

        // Allocate space for the sub-arrays
        String[] leftArray = new String[n1];
        String[] rightArray = new String[n2];

        // store in temp sub-arrays
        for (int i=0; i<n1; i++){
            leftArray[i] = arr[left + i];
        }
        for (int i=0; i<n2; i++){
            rightArray[i] = arr[middle + 1 + i];
        }

        // initialize idx for sub and merged arrays
        int i = 0, j = 0, k = left;

        // compare sub-arrays elements and merge them in sorted order
        while (i<n1 && j<n2){
            if (leftArray[i].length() < rightArray[j].length()){
                arr[k++] = leftArray[i++];
            } else {
                arr[k++] = rightArray[j++];
            }
        }

        while (i<n1) {
            arr[k++] = leftArray[i++];
        }

        while (j<n2){
            arr[k++] = rightArray[j++];
        }

    }

}
