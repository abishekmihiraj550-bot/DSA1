
public class DoublyLinkedList {

    class Node {
        int data;
        Node prev, next;
        Node(int d) { data = d; }
    }

    Node head = null;

    void insert(int x) {
        Node n = new Node(x);
        if (head == null)
            head = n;
        else {
            Node t = head;
            while (t.next != null) t = t.next;
            t.next = n;
            n.prev = t;
        }
    }

    void display() {
        Node t = head;
        while (t != null) {
            System.out.print(t.data + " <-> ");
            t = t.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedList l = new DoublyLinkedList();
        l.insert(10);
        l.insert(20);
        l.insert(30);
        l.display();
    }
}
