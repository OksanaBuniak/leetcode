import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseLinkedListIITest {

    public static ReverseLinkedListII.ListNode createList(int... numbers) {
        if (numbers.length == 0) return null;

        ReverseLinkedListII.ListNode head = new ReverseLinkedListII.ListNode(numbers[0]);
        ReverseLinkedListII.ListNode tail = head;

        for (int i = 1; i < numbers.length; i++) {
            tail.next = new ReverseLinkedListII.ListNode(numbers[i]);
            tail = tail.next;
        }

        return head;
    }

    @Test
    public void testCreateList() {
        assertEquals(createList(), createList());
        assertEquals(createList(1), createList(1));
        assertEquals(createList(2, 3), createList(2, 3));
        assertNotEquals(createList(1, 2, 3), createList(1, 2));
    }

    @Test
    public void testEmpty() {
        assertNull(ReverseLinkedListII.reverseBetween(null, 1, 3));
    }

    @Test
    public void testOneElement() {
        assertEquals(createList(1), ReverseLinkedListII.reverseBetween(createList(1), 1, 1));
    }

    @Test
    public void testTwoElements() {

    }

    @Test
    public void test5Elements() {
        assertEquals(createList(1, 5, 4, 3, 2, 6), ReverseLinkedListII.reverseBetween(createList(1, 2, 3, 4, 5, 6), 2, 5));
    }

}