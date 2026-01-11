package activities.a05TreeMapBasicOp;

import java.util.TreeMap;

public class BooksInventory {
    private TreeMap<String, String> books = new TreeMap<>();

    public void addOrUpdateBook(String isbn, String title) {
        // TODO 1: add or update to the TreeMap
        books.put(isbn, title);
        System.out.println("ISBN " + isbn + " has been added/updated.");
    }

    public void removeBook(String isbn) {
        // TODO 2: check and remove only if present from the TreeMap, else print appropriate message
        if (books.containsKey(isbn)) {
            books.remove(isbn);
        } else {
            System.out.println(isbn + ": Book not on Inventory.");
        }
    }

    public void getBookTitle(String isbn) {
        // TODO 3: get from TreeMap and print appropriate message if not found
        String title = books.get(isbn);
        if (title != null){
            System.out.println("ISBN: " + isbn + " - Title: " + title);
        } else {
            System.out.println("ISBN not found.");
        }
    }

    public void displayAllBooks() {
        // TODO 4: display all the elements in TreeMap
        System.out.println("Books list: " + books);
    }

    public static void main(String[] args) {
        BooksInventory inventory = new BooksInventory();

        // Add or update books
        inventory.addOrUpdateBook("978-0134685991", "Effective Java");
        inventory.addOrUpdateBook("978-1491950357", "Clean Architecture");
        inventory.addOrUpdateBook("978-0132350884", "Clean Code");

        // Display all books
        inventory.displayAllBooks();

        // Retrieve the title of a specific book by ISBN
        inventory.getBookTitle("978-0134685991");

        // Remove a book
        inventory.removeBook("978-1491950357");

        // Display all books after removal
        inventory.displayAllBooks();
    }
}