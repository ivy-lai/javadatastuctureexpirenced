package Practice_Ivy;

import java.util.ArrayList;
import java.util.LinkedList;

public class BookLinkedListImpl {
    public static void main(String[] args) {
        BookLinkedList bookLinkedList = new BookLinkedList();

        bookLinkedList.addTofront(new Book("To Kill a Mockingbird", "Harper Lee", 123));
        bookLinkedList.addTofront(new Book("Nineteen Eighty-Four", "George Orwell", 234));
        bookLinkedList.addTofront(new Book("The Great Gatsby", "F. Scott Fitzgerald", 345));

        bookLinkedList.printList();
    }
}
