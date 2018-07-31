import java.util.Stack;

public class PalindromeLinkedListStack {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }

        /* Solution 1 - Stack
        Stack<Integer> values = new Stack<>();
        ListNode current = head;
        while (current != null) {
            values.push(current.val);
            current = current.next;
        }
        current = head;
        while (current != null) {
            int val = values.pop();
            if (val != current.val) {
                return false;
            }
            current = current.next;
        }

        return true; */

        // Solution 2 - reverse second half

        if (head.next == null) {
            return true;
        }
        ListNode current = head;
        ListNode second = head;

        while (second != null && second.next != null) {
            current = current.next;
            second = second.next.next;
        }

        if (second != null) {
            current = current.next;
        }

        second = reverseList(current);
        while (second != null) {
            if (head.val != second.val) {
                return false;
            }
            head = head.next;
            second = second.next;
        }

        return true;
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
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
        ListNode input = createList(1, 2, 3, 4, 3, 2, 1);
        System.out.println(isPalindrome(input));
        ListNode input2 = createList(1, 2, 3, 4, 4, 3, 2, 1);
        System.out.println(isPalindrome(input2));
        ListNode input3 = null;
        System.out.println(isPalindrome(input3));
        ListNode input4 = createList(1, 2, 3);
        System.out.println(isPalindrome(input4));
        ListNode input5 = createList(1, 1);
        System.out.println(isPalindrome(input5));
    }
}
