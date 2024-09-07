package FinalProject;

import java.util.ArrayList;

public class Reader {

    int id;
    String name;
    ArrayList<String> ReadBooks = new ArrayList<>();

    public Reader(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void readBook(String bookTitle) {
        ReadBooks.add(bookTitle);
        System.out.println("Book added to reader's list.");
    }
}






