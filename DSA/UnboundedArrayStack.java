
public class UnboundedArrayStack {
    private int[] arr;
    private int top;

    public UnboundedArrayStack() {
        arr = new int[2];
        top = -1;
    }

    void push(int x) {
        if (top == arr.length - 1)
            resize(arr.length * 2);

        arr[++top] = x;
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }

        int value = arr[top--];

        if (top > 0 && top == arr.length / 4)
            resize(arr.length / 2);

        return value;
    }

    void resize(int newSize) {
        int[] newArr = new int[newSize];
        for (int i = 0; i <= top; i++)
            newArr[i] = arr[i];
        arr = newArr;
    }

    public static void main(String[] args) {
        UnboundedArrayStack s = new UnboundedArrayStack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        System.out.println("Pop: " + s.pop());
    }
}
