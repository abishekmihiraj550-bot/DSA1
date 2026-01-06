public class LinkedListFIFOQueue {

    class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    Node front = null, rear = null;

    void enqueue(int x) {
        Node n = new Node(x);
        if (rear == null)
            front = rear = n;
        else {
            rear.next = n;
            rear = n;
        }
    }

    int dequeue() {
        if (front == null) {
            System.out.println("Queue empty");
            return -1;
        }
        int value = front.data;
        front = front.next;
        if (front == null) rear = null;
        return value;
    }

    public static void main(String[] args) {
        LinkedListFIFOQueue q = new LinkedListFIFOQueue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println("Dequeue: " + q.dequeue());
    }
}
