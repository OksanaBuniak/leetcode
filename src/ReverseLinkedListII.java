
public class ReverseLinkedListII {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode (int x) {
            val = x;
        }

        @Override
        public boolean equals(Object that) {
            if (!(that instanceof ListNode)) {
                return false;
            }

            ListNode obj = (ListNode) that;
            boolean hasNext = (next != null);
            boolean thatHasNext = (obj.next != null);
            return val == obj.val && hasNext == thatHasNext && ((!hasNext && !thatHasNext) || next.equals(obj.next));
        }

        @Override
        public String toString() {
            ReverseLinkedListII.ListNode current = this;

            StringBuilder sb = new StringBuilder();

            int maxSize = 10;

            while (current != null && (maxSize-- > 0)) {
                if (sb.length() > 0) {
                    sb.append(" -> ");
                }
                sb.append(current.val);
                current = current.next;
            }
            return sb.toString();
        }
    }

    public static ListNode reverseBetween(ListNode head, int m, int n) {

        if (n == 1 || m == n) {
            return head;
        }

        if (n == 2) {
            ListNode tail = head.next;
            head.next = tail.next;
            tail.next = head;
            return tail;
        }

        ListNode leftTail = getLeftTail(head, m);
        ListNode rightHead = leftTail != null ? leftTail.next : head; //if tail != null then .next else use head
        ListNode reversed = reverseSubList(rightHead, n - m + 1);

        if (leftTail != null) {
            leftTail.next = reversed;
            return head;
        }

        return reversed;
    }

    private static ListNode reverseSubList(ListNode head, int numberOfElements) {
        int i = 1;
        ListNode current = head.next;
        ListNode tail = head;
        while (i < numberOfElements) {
            tail.next = current.next;
            current.next = head;
            head = current;
            current = tail.next;
            i = i + 1;
        }
        return head;
    }

    private static ListNode getLeftTail(ListNode head, int m) {
        ListNode leftTail = null;
        ListNode current = head;
        int i = 1;
        while (i < m) {
            leftTail = current;
            i = i + 1;
            current = current.next;
        }
        return leftTail;
    }




    public static void main(String[] args) {
        //ListNode head = reverseBetween(createList(1, 2, 3, 4, 5, 6), 2, 6);
        //ListNode head = reverseBetween(createList(1, 2, 3), 1, 2);
        //ListNode head = reverseBetween(createList(1, 2, 3), 2, 3);
        //ListNode head = reverseBetween(createList(5), 1, 1);
        //ListNode head = reverseBetween(createList(1, 2, 3), 1, 3);
        //ListNode head = reverseBetween(createList(-3,-2,3,-5,3,4,-4), 6, 7);
    }
}


/*

        int originalM = m;
        if (m == 1) {
            ListNode zero = new ListNode(0);
            zero.next = head;
            head = zero;
            m = m + 1;
            n = n + 1;
        }

        int i = 1;
        ListNode current = head;

        while (i < m - 1) {
           current = current.next;
            i = i + 1;
        }
        ListNode leftTail = current;
        ListNode mNode = current.next;
        current = current.next.next;

        i = m + 1;
        while (i <= n) {
            ListNode nextNode = current.next;
            mNode.next = current.next;
            current.next = leftTail.next;
            leftTail.next = current;
            i = i + 1;
            current = nextNode;
        }

        if (originalM == 1) {
            return head.next;
        }
 */