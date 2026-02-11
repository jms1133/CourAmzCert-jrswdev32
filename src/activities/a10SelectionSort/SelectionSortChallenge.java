package activities.a10SelectionSort;

public class SelectionSortChallenge {
    public static void main(String[] args) {
        // Sample list of test scores
        int[] testScores = {85, 92, 78, 96, 89, 73, 91};

        // Call the method to sort in descending order
        selectionSortDescending(testScores);

        // Print the sorted scores
        System.out.print("Test scores sorted in descending order: ");
        for (int score : testScores) {
            System.out.print(score + " ");
        }
    }

    public static void selectionSortDescending(int[] arr) {
        // TODO: Write the logic to sort the scores in descending order using selection sort
        int n = arr.length;

        for (int i = 0; i < n - 1; i++){
            int mindx = i;

            for (int j = i + 1; j < n; j++){
                if (arr[j] < arr[mindx]){
                    mindx = j;
                }
            }

            int temp = arr[mindx];
            arr[mindx] = arr[i];
            arr[i] = temp;
        }
    }
}