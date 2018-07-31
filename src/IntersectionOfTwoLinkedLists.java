import java.util.HashSet;

public class IntersectionOfTwoLinkedLists {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode intersection = null;

        HashSet<ListNode> nodes = new HashSet<>();
        while (headA != null) {
            nodes.add(headA);
            headA = headA.next;
        }
        while (headB != null) {
            if (nodes.contains(headB)) {
                return headB;
            }
            headB = headB.next;
        }

        return intersection;
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
        ListNode first = createList(1, 2, 3, 4);
        ListNode second = new ListNode(3);
        ListNode next = new ListNode(2);
        second.next = next;
        next.next = first;
        ListNode intersection = getIntersectionNode(first, second);
        System.out.println(intersection.val);
    }
}
