# Activity: Implementing Selection Sort

## **Introduction**

The selection sort algorithm works by dividing the list into two parts: a sorted portion on the left and an unsorted portion on the right. The algorithm repeatedly selects the smallest element from the unsorted portion and swaps it with the leftmost unsorted element, as a result growing the sorted portion by one element at a time.

In this reading, you will see and interact with a code sample demonstrating the selection sort algorithm. You'll learn how it works, step by step, and understand the logic behind its operations.

Then, you can practice sorting data using the selection sort algorithm and learn how to modify it to sort it from highest to lowest.

## **Explore an example of selection sort**

Imagine Ashley is arranging books on a shelf by height. Selection sort can help her find the shortest book from the remaining pile and place it in the correct spot on the shelf. As she continues, the bookshelf becomes more and more organized, with the shortest books on the left and the tallest on the right.

You have the following data:

- *heightOfBooks*: An array of integers representing the height of the books [29, 10, 14, 37, 13].

## **Passes in selection sort (table format)**

| **Pass** | **Array state** | **Action taken** |
| --- | --- | --- |
| 1 | {29, 10, 14, 37, 13} | Swap 10 with 29 |
| 2 | {10, 29, 14, 37, 13} | Swap 13 with 29 |
| 3 | {10, 13, 14, 37, 29} | No swap needed |
| 4 | {10, 13, 14, 37, 29} | Swap 29 with 37 |
| 5 | {10, 13, 14, 29, 37} | Array is fully sorted |


Next, let’s unpack the output for the selection sort method.

| **Selection sort** | **Explanation** |
| --- | --- |
| (line of code)int n = arr.length; | **Length of the array:int n = arr.length; stores the length of the array in the variable n.** |
| (line of code)for (int counter1 = 0; counter1 < n - 1; counter1++) | **Outer loop (counter1):The outer loop for (int counter1 = 0; counter1 < n - 1; counter1++) iterates through the array. This loop tracks the boundary between the sorted and unsorted portions of the array.counter1 starts at 0 and goes up to n-2. Each iteration of this loop represents one pass through the array, where the smallest unsorted element is selected and moved to its correct position.** |
| (line of code)int minIndex = counter1; for (int counter2 = counter1 + 1; counter2 < n; counter2++) { if (arr[counter2] < arr[minIndex]) { minIndex = counter2; | **Finding the minimum element:int minIndex = counter1; initializes minIndex to the current position of counter1. This variable keeps track of the index of the smallest element found in the unsorted portion.The inner loop for (int counter2 = counter1 + 1; counter2 < n; counter2++) iterates through the remaining unsorted portion of the array to find the smallest element.The condition if (arr[counter2] < arr[minIndex]) checks if the current element (arr[counter2]) is smaller than the element at minIndex. If it is, minIndex is updated to counter2.** |
| (line of code)int temp = arr[minIndex]; arr[minIndex] = arr[counter1]; arr[counter1] = temp; | **Swapping the elements:After the inner loop finds the smallest element in the unsorted portion, it's swapped with the element at the beginning of the unsorted portion arr[counter1].int temp = arr[minIndex]; temporarily stores the smallest element.arr[minIndex] = arr[counter1]; replaces the smallest element with the first unsorted element.arr[counter1] = temp; places the smallest element in its correct position, expanding the sorted portion of the array by one element.** |

## Challenge: Using the selection sort algorithm
Let’s continue practicing sorting with a challenge!

Ashley is a teacher who wants to rank her students' test scores from highest to lowest. She has a list of scores but needs help sorting them efficiently. To assist Ashley, implement a program using the selection sort algorithm that sorts the test scores in descending order.

You have the following data:

`testScores`: An array of integers representing the test scores of students [85, 92, 78, 96, 89, 73, 91]

The main class with the initialized array for sorting has been provided to you.

### Requirements

Complete these steps in the interactive code block:

TODO: Write the logic to sort the array of test scores[] in descending order using selection sort

Select Run to view the output.

Examine the output.

```java
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
    }
}
```