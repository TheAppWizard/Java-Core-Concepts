
// ArrayList and LinkedList (List):
// ArrayList: Used to store a list of books in a dynamic, resizable array.
// LinkedList: Another type of list that's better suited for frequent insertions and deletions.


// HashSet and TreeSet (Set):
// HashSet: Stores books with no duplicates and no order (like a unique collection of books).
// TreeSet: Stores books in a sorted order by price (or whatever is specified).

// HashMap and TreeMap (Map):
// HashMap: Maps a book's ISBN (International Standard Book Number) to its details (title, author, and price).
// TreeMap: Maps books by ISBN but sorts them by title using a custom comparator.


// Iterator and ListIterator:
// Iterator: A way to go through all the books in the ArrayList.
// ListIterator: A special iterator that allows us to move through the LinkedList in both directions (forward and backward).

// Comparable and Comparator:
// Comparable: We used Comparable to naturally sort books by their price in bookList.
// Comparator: We used Comparator to sort books by their title in bookTreeSet.


import java.util.*;

class Book implements Comparable<Book> {
    String title;
    String author;
    double price;

    // Constructor to initialize the book details
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Implementing compareTo to sort books by price (natural order)
    @Override
    public int compareTo(Book other) {
        return Double.compare(this.price, other.price);  // Compare books by price
    }

    // Overriding toString to print the book details
    @Override
    public String toString() {
        return title + " by " + author + " - $" + price;
    }
}

class BookTitleComparator implements Comparator<Book> {
    // Custom comparator to sort books by title
    @Override
    public int compare(Book b1, Book b2) {
        return b1.title.compareTo(b2.title);  // Sort by book title
    }
}

public class CollectionsEx {
    public static void main(String[] args) {
        // 1. Using ArrayList to store books (A dynamic list)
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 10.99));
        bookList.add(new Book("1984", "George Orwell", 8.99));
        bookList.add(new Book("To Kill a Mockingbird", "Harper Lee", 12.49));

        // 2. Using LinkedList (Similar to ArrayList but faster for certain operations)
        List<Book> bookLinkedList = new LinkedList<>();
        bookLinkedList.add(new Book("Moby-Dick", "Herman Melville", 15.99));
        bookLinkedList.add(new Book("Pride and Prejudice", "Jane Austen", 7.99));

        // Display ArrayList and LinkedList contents
        System.out.println("ArrayList of Books:");
        for (Book book : bookList) {
            System.out.println(book);
        }

        System.out.println("\nLinkedList of Books:");
        for (Book book : bookLinkedList) {
            System.out.println(book);
        }

        // 3. Using HashSet (No duplicates and no specific order)
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("The Catcher in the Rye", "J.D. Salinger", 9.99));
        bookSet.add(new Book("The Catcher in the Rye", "J.D. Salinger", 9.99));  // Duplicate, won't be added

        // 4. Using TreeSet (No duplicates and ordered by price)
        Set<Book> bookTreeSet = new TreeSet<>();
        bookTreeSet.add(new Book("War and Peace", "Leo Tolstoy", 20.00));
        bookTreeSet.add(new Book("Crime and Punishment", "Fyodor Dostoevsky", 18.00));

        System.out.println("\nHashSet of Books (no duplicates, no order):");
        for (Book book : bookSet) {
            System.out.println(book);
        }

        System.out.println("\nTreeSet of Books (ordered by price):");
        for (Book book : bookTreeSet) {
            System.out.println(book);
        }

        // 5. Using HashMap (Mapping titles to books)
        Map<String, Book> bookMap = new HashMap<>();
        bookMap.put("9780451524935", new Book("1984", "George Orwell", 8.99));
        bookMap.put("9780061120084", new Book("To Kill a Mockingbird", "Harper Lee", 12.49));

        // 6. Using TreeMap (Ordered by ISBN)
        Map<String, Book> bookTreeMap = new TreeMap<>();
        bookTreeMap.put("9780140449136", new Book("War and Peace", "Leo Tolstoy", 20.00));
        bookTreeMap.put("9780679404026", new Book("Pride and Prejudice", "Jane Austen", 7.99));

        // Display HashMap and TreeMap contents
        System.out.println("\nHashMap of Books (by ISBN):");
        for (Map.Entry<String, Book> entry : bookMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("\nTreeMap of Books (ordered by ISBN):");
        for (Map.Entry<String, Book> entry : bookTreeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // 7. Sorting the bookMap by title (using List and Comparator)
        System.out.println("\nSorting bookMap values by title (using Comparator):");
        List<Book> sortedBooks = new ArrayList<>(bookMap.values());
        Collections.sort(sortedBooks, new BookTitleComparator());
        for (Book book : sortedBooks) {
            System.out.println(book);
        }

        // 8. Using Iterator to go through bookList
        System.out.println("\nUsing Iterator on bookList:");
        Iterator<Book> iterator = bookList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 9. Using ListIterator to go through bookLinkedList
        System.out.println("\nUsing ListIterator on bookLinkedList:");
        ListIterator<Book> listIterator = bookLinkedList.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        // 10. Sorting bookList by price using Comparable (already implemented in Book class)
        System.out.println("\nSorting bookList by price (using Comparable):");
        Collections.sort(bookList);
        for (Book book : bookList) {
            System.out.println(book);
        }

        // 11. Sorting bookTreeSet by title using Comparator
        System.out.println("\nSorting bookTreeSet by title (using Comparator):");
        List<Book> sortedByTitle = new ArrayList<>(bookTreeSet);
        Collections.sort(sortedByTitle, new BookTitleComparator());
        for (Book book : sortedByTitle) {
            System.out.println(book);
        }
    }
}
