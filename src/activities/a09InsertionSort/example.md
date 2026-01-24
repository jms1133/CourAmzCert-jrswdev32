Initial List: ["Zara", "Mia", "Anna", "Sophia", "Ben"]
First Pass (counter1 = 1, key = "Mia"):
Compare "Zara" with "Mia": Since "Zara" comes after "Mia" alphabetically, "Zara" is shifted right.
Insert "Mia" at index 0.
Array: ["Mia", "Zara", "Anna", "Sophia", "Ben"]
Second Pass (counter1 = 2, key = "Anna"):
Compare "Zara" with "Anna": "Zara" is shifted right.
Compare "Mia" with "Anna": "Mia" is shifted right.
Insert "Anna" at index 0.
Array: ["Anna", "Mia", "Zara", "Sophia", "Ben"]
Third Pass (counter1 = 3, key = "Sophia"):
Compare "Zara" with "Sophia": "Zara" is shifted right.
Insert "Sophia" at index 2.
Array: ["Anna", "Mia", "Sophia", "Zara", "Ben"]
Fourth Pass (counter1 = 4, key = "Ben"):
Compare "Zara" with "Ben": "Zara" is shifted right.
Compare "Sophia" with "Ben": "Sophia" is shifted right.
Compare "Mia" with "Ben": "Mia" is shifted right.
Insert "Ben" at index 1.
Final Sorted Array: ["Anna", "Ben", "Mia", "Sophia", "Zara"]

# Challenge: Sorting names in reverse alphabetical order
Now it’s your turn to implement an Insertion Sort algorithm. You will take the same list of names and sort the names in reverse alphabetical order (i.e., descending order).
You have the following data:
A list of names: {"Augusta", "Ria", "Jodee", "Sophia", "James"};
Requirements:
Complete these steps in the interactive code block:
The Main class with the initialized array for sorting has been provided to you.
TODO: Write the logic to sort the names in descending order.
Select Run to view the output.
Examine the output. 