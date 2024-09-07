package FinalProject;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();
        Shelf shelf1 = new Shelf();
        Shelf shelf2 = new Shelf();
        Shelf shelf3 = new Shelf();

        Book book1 = new Book("Lewis Carroll", "Alice In Wonderland", 352);
        Book book2 = new Book("A. A. Milne", "Winnie-the-Pooh", 160);
        Book book3 = new Book("Jane Austen", "Pride and Prejudice", 279);
        Book book4 = new Book("Louisa May Alcott", "Little Women", 816);
        Book book5 = new Book("Charlotte Bronte", "Jane Eyre", 410);
        Book book6 = new Book("F. Scott Fitzgerald", "The Great Gatsby", 180);


        library.addNewBookToLibrary(book1);
        library.addNewBookToLibrary(book2);
        library.addNewBookToLibrary(book3);
        library.addNewBookToLibrary(book4);
        library.addNewBookToLibrary(book5);
        library.addNewBookToLibrary(book6);


        library.displayBooks();
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("For adding a book - Press 1");
            System.out.println("For deleting a book - Press 2");
            System.out.println("For registering a new reader - Press 3");
            System.out.println("For removing a reader - Press 4");
            System.out.println("For searching books by author – Press 5");
            System.out.println("For exit – Press 6");

            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter author name: ");
                    String author = input.nextLine();
                    System.out.print("Enter book title: ");
                    String title = input.nextLine();
                    System.out.print("Enter number of pages: ");
                    int numOfPages = input.nextInt();

                    Book newBook = new Book(author, title, numOfPages);
                    library.addNewBookToLibrary(newBook);
                    break;

                case 2:
                    System.out.print("Enter book title to delete: ");
                    String bookTitle = input.nextLine();
                    if (library.deleteBook(bookTitle)) {
                        System.out.println("Book deleted successfully.");
                    }
                    break;

                case 3:
                    System.out.print("Enter reader ID: ");
                    int id = input.nextInt();
                    input.nextLine();
                    System.out.print("Enter reader name: ");
                    String readerName = input.nextLine();
                    library.registerReader(id, readerName);
                    System.out.println("Reader registered successfully.");
                    break;

                case 4:
                    System.out.print("Enter reader name to remove: ");
                    String readerToRemove = input.nextLine();
                    if (library.removeReader(readerToRemove)) {
                        System.out.println("Reader removed successfully.");
                    } else {
                        System.out.println("Reader not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter author name to search: ");
                    String authorName = input.nextLine();
                    library.searchByAuthor(authorName);
                    break;

                case 6:
                    System.out.println("Exiting the program.");
                    return;

                default:
                    System.out.println("Invalid option. Try again.");
            }

            System.out.println();
            library.displayBooks();
        }
    }
}





