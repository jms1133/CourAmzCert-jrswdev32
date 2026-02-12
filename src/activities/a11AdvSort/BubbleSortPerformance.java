package activities.a11AdvSort;

public class BubbleSortPerformance {
    public static void bubbleSort(int[] numbers){
        for (int i = 0; i < numbers.length - 1; i++){
            for (int j = 0; j < numbers.length - i - 1; j++){
                if (numbers[j] > numbers[j+1]){
                    swap(numbers, j, j+1);
                }
            }
        }
    }

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
