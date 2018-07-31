public class MinStack {

    private Node head = null;

    public class Node {
        int item;
        int min;
        Node next;
        Node (int x) {
            this.item = x;
        }
    }

    public void push(int x) {
        Node current = new Node(x);
        current.next = head;
        if (head == null) {
            current.min = x;
        } else {
            current.min = Math.min(head.min, x);
        }
        head = current;
    }

    public void pop() {
        if (head != null) {
            head = head.next;
        }
    }

    public int top() {
        if (head == null) {
            return 0;
        } else {
            return head.item;
        }
    }

    public int getMin() {
            return head.min;
    }

    public static void main(String[] args) {
        MinStack test = new MinStack();
        /*test.push(-2);
        test.push(0);
        test.push(-3);
        test.pop();
        System.out.println(test.top());
        System.out.println(test.getMin()); */

        test.push(-1);
        System.out.println(test.top());
        System.out.println(test.getMin());
    }

}
