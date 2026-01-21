package activities.a07BinarySearch;

public class BinarySearchChallenge {

    public static void main(String[] args) {
        //int[] arr = {10,20,30,40,50};
        int[] arr = {10, 20, 20, 30, 40, 50};
        int target = 20;

        boolean multiple = hasMultipleOccurrences(arr, target);
        System.out.println("Has Multiple Occurrences: " + multiple);
    }

    private static boolean hasMultipleOccurrences(int[] arr, int target) {
        int l = 0;
        int r = arr.length-1;
        while (l<=r){
            int m = l + (r-l)/2;

            if (arr[m] == target) {
                if(m>0 && arr[m-1]==target) return true;
                if(m<arr.length-1 && arr[m+1]==target) return true;
                return false;
            }
            if (arr[m] > target) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return false;
    }
}
