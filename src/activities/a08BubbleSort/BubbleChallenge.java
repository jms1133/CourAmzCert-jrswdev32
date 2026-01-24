package activities.a08BubbleSort;

public class BubbleChallenge {
    public static void main(String[] args) {
        int[] heights = {198, 185, 210, 176, 195};
        bubbleSortDescending(heights);

        System.out.print("Sorted heights in descending order: ");
        for (int height : heights) {
            System.out.print(height + " ");
        }
    }
    public static void bubbleSortDescending(int[] arr) {
        //TODO: write your bubble sort logic here
        int n = arr.length;

        for (int i=0; i<n-1; i++){
            for (int j=0; j<n-1-i; j++){
                if (arr[j]<arr[j+1]){
                    swap(arr, j);
                }
            }
        }
    }

    private static void swap(int[] arr, int j) {
        int temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = temp;
    }
}