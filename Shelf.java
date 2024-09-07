package FinalProject;


import java.util.ArrayList;

public class Shelf {
    ArrayList<Book> books = new ArrayList<>();
    final int amount = 5;

    public boolean isShelfFull() {
        return books.size() >= amount;
    }

    public boolean setBook(Book book) {
        if (!isShelfFull()) {
            books.add(book);
            return true;
        } else {
            System.out.println("Shelf is full");
            return false;
        }
    }

    public void replaceBooks(int p1, int p2) {
        if (p1 < 0 || p1 >= books.size() || p2 < 0 || p2 >= books.size()) {
            System.out.println("Invalid positions");
            return;
        }
        Book b = books.get(1);
        books.set(p1, books.get(p2));
        books.set(p2, b);

        System.out.println("Books are replaced successfully.");
    }



    }






















