package Practice_Ivy;

import java.util.ArrayList;

public class bookArrayList {
    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();

        bookList.add(new Book("To Kill a Mockingbird", "Harper Lee", 123));
        bookList.add(new Book("Nineteen Eighty-Four", "George Orwell", 234));
        bookList.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", 345));

        bookList.forEach(book -> System.out.println(book.toString()));

    }
}
