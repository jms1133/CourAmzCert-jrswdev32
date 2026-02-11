package activities.a10SelectionSort;

public class Overview {

    public static void printArray(int[] sizes){
        for (int size : sizes){
            System.out.println(size + "mm ");
        }
        System.out.println();
    }

    public static void selectionSort(int[] sizes){
        int n = sizes.length;

        for (int counter = 0; counter < n - 1; counter++){
            //assume the min is the first unsorted element
            int minIdx = counter;

            // Find the min element in the unsorted portion
            for (int newCounter = counter + 1; newCounter < n; newCounter++){
                if (sizes[newCounter] < sizes[minIdx]){
                    minIdx = newCounter;
                }
            }
            //swap the found min element with the 1st unsorted
            int temp = sizes[minIdx];
            sizes[minIdx] = sizes[counter];
            sizes[counter] = temp;
        }
    }

    public static void main(String[] args) {
        // coin sizes in mm
        int[] coinSizes = {25,15,30,20,10};

        System.out.println("Juan's initial coin sizes:");
        printArray(coinSizes);

        // sort the coins using Selection Sort
        selectionSort(coinSizes);

        // Display sorted coin sizes
        System.out.println("Juan's sorted coin sizes:");
        printArray(coinSizes);

    }
}
