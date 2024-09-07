package FinalProject;

import java.util.ArrayList;

public class Library {

    ArrayList<Shelf> shelves = new ArrayList<>();
    ArrayList<Reader> readers = new ArrayList<>();

    public Library() {
        for (int i = 0; i < 3; i++) {
            shelves.add(new Shelf());
        }
    }

    public boolean isSpaceForNewBook() {
        for (Shelf shelf : shelves) {
            if (!shelf.isShelfFull()) {
                return true;
            }
        }
        return false;
    }

    public boolean addNewBookToLibrary(Book book) {
        for (Shelf shelf : shelves) {
            if (!shelf.isShelfFull()) {
                return shelf.setBook(book);
            }
        }
        System.out.println("No place in the library for a new book.");
        return false;
    }

    public boolean deleteBook(String title) {
        for (Shelf shelf : shelves) {
            for (Book book : shelf.books) {
                if (book.getTitle().equals(title)) {
                    shelf.books.remove(book);
                    return true;
                }
            }
        }
        System.out.println("Book not found.");
        return false;
    }

    public void registerReader(int id, String name) {
        readers.add(new Reader(id, name));
    }

    public boolean removeReader(String name) {
        return readers.removeIf(reader -> reader.name.equals(name));
    }

    public void searchByAuthor(String author) {
        System.out.println("Books by " + author + ":");
        for (Shelf shelf : shelves) {
            for (Book book : shelf.books) {
                if (book.getAuthor().equals(author)) {
                    System.out.println(book.getTitle());
                }

            }
        }
    }

    public void displayBooks() {
        System.out.println("Books in Library:");
        for (Shelf shelf : shelves) {
            for (Book book : shelf.books) {
                System.out.println(book);
            }
        }
    }
}











