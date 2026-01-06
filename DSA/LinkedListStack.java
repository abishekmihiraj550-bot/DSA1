public class LinkedListStack {

    class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    Node top = null;

    void push(int x) {
        Node n = new Node(x);
        n.next = top;
        top = n;
    }

    int pop() {
        if (top == null) {
            System.out.println("Stack empty");
            return -1;
        }
        int value = top.data;
        top = top.next;
        return value;
    }

    public static void main(String[] args) {
        LinkedListStack s = new LinkedListStack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println("Pop: " + s.pop());
    }
}
