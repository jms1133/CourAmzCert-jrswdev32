package activities.a07BinarySearch;

public class BinarySearchChallenge {

    public static void main(String[] args) {

        int[] arr = {10, 20, 20, 30, 40, 50};
        int target = 20;


        boolean multiple = hasMultipleOccurrences(arr, target);
        System.out.println("Has Multiple Occurrences: " + multiple);
    }


    public static boolean hasMultipleOccurrences(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;


        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                // Check if there's a duplicate to the left
                if (mid > 0 && arr[mid - 1] == target) {
                    return true;
                }

                // Check if there's a duplicate to the right
                if (mid < arr.length - 1 && arr[mid + 1] == target) {
                    return true;
                }

                // No duplicates found
                return false;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}
