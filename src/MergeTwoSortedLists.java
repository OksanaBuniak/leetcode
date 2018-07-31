public class MergeTwoSortedLists {

    public static class ListNode {
         int val;
         ListNode next;
         ListNode(int x) { val = x; }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        ListNode current = new ListNode(0);
        ListNode result = current;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        if (l1 != null) {
            current.next = l1;
        }
        if (l2 != null) {
            current.next = l2;
        }
        return result.next;
    }

    public static void main(String[] args) {
        //ListNode list1 = new MergeTwoSortedLists().createList(1, 2, 3, 4);
        //ListNode list2 = new MergeTwoSortedLists().createList(2, 2, 4, 4);
        ListNode list1 = new MergeTwoSortedLists().createList(2, 3);
        ListNode list2 = new MergeTwoSortedLists().createList(1, 2);
        ListNode result = mergeTwoLists(list1, list2);
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
}
