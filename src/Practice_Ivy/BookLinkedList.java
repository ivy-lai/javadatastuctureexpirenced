package Practice_Ivy;

import Practice_Ivy.BookNode;

public class BookLinkedList {

    private BookNode head; // the current head of the LL
    private int size;


    public void addTofront(Book book) {
        // create a new node
        BookNode node = new BookNode(book);
        // point its pointer to the current head of the LL
        node.setNext(head);
        // and designate this new Node the head of the LL
        head = node;
        size++;
    }

    /**
     * @return
     */
    public BookNode removeFromFront() {
        // check for empty first
        if (isEmpty()) {
            return null;
        }
        // get a handle on the current head node
        BookNode node = head;
        // go to the Node that it is pointing to and set that equal to the new head
        head = head.getNext();
        // set this now former head node's next to null to complete the detachment
        node.setNext(null);
        // descrement the size
        size--;
        // return this node for whatever reason
        return node;
    }

    /**
     *
     */
    public void printList() {
        BookNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println(" null");
    }

    /**
     * @return
     */
    public int getSize() {
        return size;
    }

    /**
     * @return
     */
    public boolean isEmpty() {
        return head == null;
    }
}
