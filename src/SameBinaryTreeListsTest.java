import org.junit.Test;

import static org.junit.Assert.*;

public class SameBinaryTreeListsTest {

    @Test
    public void test1() {
        assertEquals(true, SameBinaryTreeLists.isSameTree(null, null));
    }

    @Test
    public void test2() {
        SameBinaryTreeLists.TreeNode a = new SameBinaryTreeLists.TreeNode(1);
        SameBinaryTreeLists.TreeNode b = new SameBinaryTreeLists.TreeNode(2);
        SameBinaryTreeLists.TreeNode c = new SameBinaryTreeLists.TreeNode(3);
        SameBinaryTreeLists.TreeNode d = new SameBinaryTreeLists.TreeNode(4);
        SameBinaryTreeLists.TreeNode e = new SameBinaryTreeLists.TreeNode(5);
        SameBinaryTreeLists.TreeNode f = new SameBinaryTreeLists.TreeNode(6);

        SameBinaryTreeLists.addRight(a, b);
        SameBinaryTreeLists.addLeft(a, c);
        SameBinaryTreeLists.addRight(b, d);
        SameBinaryTreeLists.addLeft(b, e);
        SameBinaryTreeLists.addLeft(c, f);

        SameBinaryTreeLists.TreeNode a2 = new SameBinaryTreeLists.TreeNode(1);
        SameBinaryTreeLists.TreeNode b2 = new SameBinaryTreeLists.TreeNode(2);
        SameBinaryTreeLists.TreeNode c2 = new SameBinaryTreeLists.TreeNode(3);
        SameBinaryTreeLists.TreeNode d2 = new SameBinaryTreeLists.TreeNode(4);
        SameBinaryTreeLists.TreeNode e2 = new SameBinaryTreeLists.TreeNode(5);
        SameBinaryTreeLists.TreeNode f2 = new SameBinaryTreeLists.TreeNode(6);

        SameBinaryTreeLists.addRight(a2, b2);
        SameBinaryTreeLists.addLeft(a2, c2);
        SameBinaryTreeLists.addRight(b2, d2);
        SameBinaryTreeLists.addLeft(b2, e2);
        SameBinaryTreeLists.addLeft(c2, f2);
        assertEquals(true, SameBinaryTreeLists.isSameTree(a, a2));
    }

    @Test
    public void test3() {
        SameBinaryTreeLists.TreeNode a = new SameBinaryTreeLists.TreeNode(1);
        SameBinaryTreeLists.TreeNode b = new SameBinaryTreeLists.TreeNode(2);
        SameBinaryTreeLists.TreeNode c = new SameBinaryTreeLists.TreeNode(3);
        SameBinaryTreeLists.TreeNode d = new SameBinaryTreeLists.TreeNode(4);
        SameBinaryTreeLists.TreeNode e = new SameBinaryTreeLists.TreeNode(5);
        SameBinaryTreeLists.TreeNode f = new SameBinaryTreeLists.TreeNode(6);

        SameBinaryTreeLists.addRight(a, b);
        SameBinaryTreeLists.addLeft(a, c);
        SameBinaryTreeLists.addRight(b, d);
        SameBinaryTreeLists.addLeft(b, e);
        SameBinaryTreeLists.addLeft(c, f);

        SameBinaryTreeLists.TreeNode a2 = new SameBinaryTreeLists.TreeNode(2);
        SameBinaryTreeLists.TreeNode b2 = new SameBinaryTreeLists.TreeNode(2);
        SameBinaryTreeLists.TreeNode c2 = new SameBinaryTreeLists.TreeNode(3);
        SameBinaryTreeLists.TreeNode d2 = new SameBinaryTreeLists.TreeNode(4);
        SameBinaryTreeLists.TreeNode e2 = new SameBinaryTreeLists.TreeNode(5);
        SameBinaryTreeLists.TreeNode f2 = new SameBinaryTreeLists.TreeNode(5);

        SameBinaryTreeLists.addRight(a2, b2);
        SameBinaryTreeLists.addLeft(a2, c2);
        SameBinaryTreeLists.addRight(b2, d2);
        SameBinaryTreeLists.addLeft(b2, e2);
        SameBinaryTreeLists.addLeft(c2, f2);
        assertEquals(false, SameBinaryTreeLists.isSameTree(a, a2));
    }

    @Test
    public void test4() {
        SameBinaryTreeLists.TreeNode a = new SameBinaryTreeLists.TreeNode(1);
        SameBinaryTreeLists.TreeNode b = new SameBinaryTreeLists.TreeNode(2);
        SameBinaryTreeLists.TreeNode c = new SameBinaryTreeLists.TreeNode(3);
        SameBinaryTreeLists.TreeNode d = new SameBinaryTreeLists.TreeNode(4);
        SameBinaryTreeLists.TreeNode e = new SameBinaryTreeLists.TreeNode(5);
        SameBinaryTreeLists.TreeNode f = new SameBinaryTreeLists.TreeNode(6);

        SameBinaryTreeLists.addRight(a, b);
        SameBinaryTreeLists.addLeft(a, c);
        SameBinaryTreeLists.addRight(b, d);
        SameBinaryTreeLists.addLeft(b, e);
        SameBinaryTreeLists.addLeft(c, f);

        SameBinaryTreeLists.TreeNode a2 = new SameBinaryTreeLists.TreeNode(1);
        SameBinaryTreeLists.TreeNode b2 = new SameBinaryTreeLists.TreeNode(2);
        SameBinaryTreeLists.TreeNode c2 = new SameBinaryTreeLists.TreeNode(3);
        SameBinaryTreeLists.TreeNode d2 = new SameBinaryTreeLists.TreeNode(4);
        SameBinaryTreeLists.TreeNode e2 = new SameBinaryTreeLists.TreeNode(5);
        SameBinaryTreeLists.TreeNode f2 = new SameBinaryTreeLists.TreeNode(6);

        SameBinaryTreeLists.addRight(a2, b2);
        SameBinaryTreeLists.addLeft(a2, c2);
        SameBinaryTreeLists.addRight(b2, d2);
        //SameBinaryTreeLists.addLeft(b2, e2);
        //SameBinaryTreeLists.addLeft(c2, f2);
        assertEquals(false, SameBinaryTreeLists.isSameTree(a, a2));
    }

    @Test
    public void test5() {
        SameBinaryTreeLists.TreeNode a = new SameBinaryTreeLists.TreeNode(1);
        SameBinaryTreeLists.TreeNode b = new SameBinaryTreeLists.TreeNode(2);
        SameBinaryTreeLists.TreeNode c = new SameBinaryTreeLists.TreeNode(3);
        SameBinaryTreeLists.TreeNode d = new SameBinaryTreeLists.TreeNode(4);
        SameBinaryTreeLists.TreeNode e = new SameBinaryTreeLists.TreeNode(5);
        SameBinaryTreeLists.TreeNode f = new SameBinaryTreeLists.TreeNode(6);

        SameBinaryTreeLists.addRight(a, b);
        SameBinaryTreeLists.addLeft(a, c);
        SameBinaryTreeLists.addRight(b, d);
        SameBinaryTreeLists.addLeft(b, e);
        SameBinaryTreeLists.addLeft(c, f);

        assertEquals(false, SameBinaryTreeLists.isSameTree(a, null));
    }
}