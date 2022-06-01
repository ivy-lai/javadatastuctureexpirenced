package Practice_Ivy;

public class BookNode {
    private Book book;
    private BookNode next;

    public BookNode(Book book) {
        this.book = book;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public BookNode getNext() {
        return next;
    }

    public void setNext(BookNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return book.toString();
    }
}
