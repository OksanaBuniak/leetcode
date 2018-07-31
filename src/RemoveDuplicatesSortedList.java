import java.util.List;

class OkSet {
    Object[] storage = new Object[1000];

    void add(Object el) {
        if (el.hashCode() > storage.length) {
            storage = new Object[el.hashCode() * 2];
        }
        storage[el.hashCode()] = el;
    }

    boolean has(Object el) {
        Object candidate = storage[el.hashCode()];
        return candidate != null && candidate.equals(el);
    }
}
//1000000000
//[10000, 10000, 0, 0, 0, ..., 10000]
//
//[5, 6, 3, 5, 4, ... ,3]

public class RemoveDuplicatesSortedList {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            ListNode current = this;

            StringBuilder sb = new StringBuilder();

            while (current != null) {
                if (sb.length() > 0) {
                    sb.append(" -> ");
                }
                sb.append(current.val);
                current = current.next;
            }
            return sb.toString();
        }

       /*  @Override
        public int hashCode() {

        }

        @Override
        public boolean equals() {

        } */
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode current = head;
        while (current.next != null) {
            if (current.next.val == current.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

    public static ListNode createList(int... numbers) {
        if (numbers.length == 0) return null;

        ListNode head = new ListNode(numbers[0]);
        ListNode tail = head;

        for (int i = 1; i < numbers.length; i++) {
            tail.next = new ListNode(numbers[i]);
            tail = tail.next;
        }

        return head;
    }

    public static void main(String[] args) {
//        ListNode one = new ListNode(1);
//        ListNode two = new ListNode(1);
//        one.next = two;
//        ListNode three = new ListNode(2);
//        two.next = three;
//        ListNode four = new ListNode(2);
//        three.next = four;
//        ListNode five = new ListNode(2);
//        four.next = five;
//        ListNode six = new ListNode(2);
//        five.next = six;
//        six.next = null;
        ListNode head = deleteDuplicates(createList(1, 1, 2, 2, 2, 2, 3, 4));
        System.out.print(head.toString());
//        while (head != null) {
//            System.out.print(head.val + "  ");
//            head = head.next;
//        }
    }
}
