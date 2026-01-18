package activities.a06LinearSearch;

public class LinearSearchExample {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int target = 30;

        int index = linearSearch(arr, target);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found.");
        }
    }

    public static int linearSearch(int[] arr, int target){
        for (int i = 0; i< arr.length; i++){
            if (arr[i] == target) return i;
        }
        return -1;
    }
}
