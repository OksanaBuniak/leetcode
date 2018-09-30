public class ReverseLinkedList {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode prev = null;
        ListNode cur = head;
        ListNode next = cur.next;

        while (cur != null) {
            cur.next = prev;
            prev = cur;
            cur = next;
            if (next != null) {
                next = next.next;
            }
        }

        return prev;
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
        ListNode input = createList(1, 2, 3, 4);
        System.out.println(reverseList(input).val);
    }
}
