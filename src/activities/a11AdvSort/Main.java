package activities.a11AdvSort;

public class Main {

    private static int[] generateArray(int size) {
        int[] numbers = new int[size];
        for (int i=0; i<size; i++){
            numbers[i] = (int) (Math.random() * 10000);
        }
        return numbers;
    }

    public static void main(String[] args) {
        int[] smallData = generateArray(100);
        int[] largeData = generateArray(10000);

        long startTime = System.currentTimeMillis();
        BubbleSortPerformance.bubbleSort(smallData);
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken to " +
                "sort a small dataset is " + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        BubbleSortPerformance.bubbleSort(largeData);
        endTime = System.currentTimeMillis();
        System.out.println("Time taken to " +
                "sort a large dataset is " + (endTime - startTime) + "ms");
    }

}
