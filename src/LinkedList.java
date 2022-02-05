class LinkedList {

    Node head;

    class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void push(int data) {
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;

    }

    void printList() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    private void deleteAlt() {
        if (head == null) {
            return;
        }

        Node prev = head;
        Node now = head.next;

        while (prev != null && now != null) {
            prev.next = now.next;
            now = null;
            prev = prev.next;
            if (prev != null) {
                now = prev.next;

            }

        }

    }

    private void reverse() {

        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;

    }

    private void deleteAll() {
        head = null;

    }

    public static void main(String[] args) {
        LinkedList linkedlist = new LinkedList();

        /* Constructed Linked List is 1->2->3->4->5->null */
        linkedlist.push(5);
        linkedlist.push(4);
        linkedlist.push(3);
        linkedlist.push(2);
        linkedlist.push(1);

        System.out.println("Linked List() ");
        linkedlist.printList();

        System.out.println("Linked List before calling reverse() ");
        linkedlist.reverse();
        linkedlist.printList();

        linkedlist.deleteAlt();

        System.out.println("Linked List after calling deleteAlt() ");
        linkedlist.printList();

        linkedlist.deleteAll();

        System.out.println("Linked List after calling deleteAll() ");
        linkedlist.printList();

    }

}
