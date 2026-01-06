public class CircularDoublyLinkedList {

    class Node {
        int data;
        Node next, prev;
        Node(int d) { data = d; }
    }

    Node head = null;

    void insert(int x) {
        Node n = new Node(x);
        if (head == null) {
            head = n;
            head.next = head;
            head.prev = head;
        } else {
            Node tail = head.prev;
            tail.next = n;
            n.prev = tail;
            n.next = head;
            head.prev = n;
        }
    }

    void display() {
        if (head == null) return;
        Node t = head;
        do {
            System.out.print(t.data + " <-> ");
            t = t.next;
        } while (t != head);
        System.out.println("(back to head)");
    }

    public static void main(String[] args) {
        CircularDoublyLinkedList l = new CircularDoublyLinkedList();
        l.insert(10);
        l.insert(20);
        l.insert(30);
        l.display();
    }
}
