package activities.a13QuickSort;

public class Overview {
    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++){
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void quickSort(int[] arr, int low, int high){
        if (low < high) {
            // partition index
            int pi = partition(arr, low, high);
            // recursively sort the left sub-array
            quickSort(arr, low, pi-1);
            // recursively sort the right sub-array
            quickSort(arr, pi+1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{300,150,400,200,500,100,450,250};
        quickSort(arr, 0, arr.length-1);

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);

        }
    }
}
