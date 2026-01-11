package activities.a04LinkedHashMapMethods;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    private LinkedHashMap<String, String> borrowedBooks = new LinkedHashMap<>();

    public void borrowBook(String studentName, String bookTitle) {
        // TODO 1: Write code to add to LinkedHashMap
        borrowedBooks.put(studentName, bookTitle);
    }

    public void returnBook(String studentName) {
        // TODO 2: Write code to check and if present remove from LinkedHashMap
        borrowedBooks.remove(studentName);
    }

    public void checkBorrowedBook(String studentName) {
        // TODO 3: Write code to check if the LinkedHashMap has the key, else print appropriate message
        if (borrowedBooks.containsKey(studentName)){ return;
        } else {
            System.out.println(studentName + " has no borrowed books.");
        }
    }

    public void displayAllBorrowedBooks() {
        // TODO 4: Check if the LinkedHashMap is empty, else print all the data in LinkedHashMap
        for (Map.Entry<String, String> entry : borrowedBooks.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public void borrowBookIfNotBorrowed(String bookTitle, String studentName) {
        // TODO 5: Check if the book is borrowed, else have the student borrow the book.
    }

    public static void main(String[] args) {
        Main library = new Main();

        // Borrowing books
        library.borrowBook("Alice", "Java Programming");
        library.borrowBook("Bob", "Data Structures");

        // Display all borrowed books
        library.displayAllBorrowedBooks();

        // Check if Charlie has borrowed any books
        library.checkBorrowedBook("Charlie");

        // Borrow a book only if it's not already borrowed
        library.borrowBookIfNotBorrowed("Java Programming", "Charlie");

        // Borrow another book
        library.borrowBookIfNotBorrowed("Operating Systems", "Charlie");

        // Return a book
        library.returnBook("Alice");

        // Display all borrowed books after return
        library.displayAllBorrowedBooks();
    }
}


