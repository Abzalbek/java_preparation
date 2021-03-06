package LinkedList;

import org.junit.Test;

public class Reverse {

    public Node reverse(Node node) {

        Node prev = null;
        Node current = node;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }


    @Test
    public void test() {

        Helper helper = new Helper();

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        helper.printList(head);
        System.out.println("\n");

        head = reverse(head);

        helper.printList(head);
    }
}
