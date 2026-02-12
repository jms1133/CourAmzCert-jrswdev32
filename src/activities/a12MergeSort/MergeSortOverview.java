package activities.a12MergeSort;

public class MergeSortOverview {
    public static void mergeSort(int[] nums, int l, int r) {
        if (nums == null || nums.length <= 1) {
            return;
        }

        if (l < r){
            int m = l + (r - l)/2;
            mergeSort(nums, l, m);
            mergeSort(nums, m+1, r);
            merge(nums, l, m, r);
        }
    }

    private static void merge(int[] nums, int l, int m, int r) {
        int sizeOfLArr = m-l+1;
        int sizeOfRArr = r-m;

        int[] lArr = new int[sizeOfLArr];
        int[] rArr = new int[sizeOfRArr];

        for (int i = 0; i < sizeOfLArr; i++){
            lArr[i] = nums[l + i];
        }

        for (int j = 0; j < sizeOfRArr; j++){
            rArr[j] = nums[m+1+j];
        }

        int idxLArr = 0;
        int idxRArr = 0;
        int idxMergedArr = l;

        while (idxLArr < sizeOfLArr && idxRArr < sizeOfRArr){
           if (lArr[idxLArr] <= rArr[idxRArr]){
               nums[idxMergedArr++] = lArr[idxLArr++];
           } else {
               nums[idxMergedArr++] = rArr[idxRArr++];
           }
        }

        while (idxLArr < sizeOfLArr) {
            nums[idxMergedArr++] = lArr[idxLArr++];
        }

        while (idxRArr < sizeOfRArr) {
            nums[idxMergedArr++] = rArr[idxRArr++];
        }

    }

    public static void main(String[] args) {
        int [] numbers = {38,27,43,3,9,82,10};
        System.out.println("Original array: ");

        for (int i=0; i<numbers.length;i++){
            System.out.print(numbers[i] + " ");
        }
        mergeSort(numbers, 0, numbers.length-1);
        System.out.println("\nSorted array: ");

        for (int i=0; i<numbers.length;i++){
            System.out.print(numbers[i] + " ");
        }

    }
}
